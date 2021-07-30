package krt.wid.record;

import android.Manifest;
import android.app.Activity;
import android.os.Environment;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;

import androidx.fragment.app.FragmentActivity;

import com.blankj.utilcode.util.AppUtils;
import com.czt.mp3recorder.MP3Recorder;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import krt.wid.util.MNewPermissions;
import krt.wid.util.MPermissions;

/**
 * @author Marcus
 * @package krt.wid.record
 * @description
 * @time 2019/1/16
 */
public class MRecordUtil {
    private MP3Recorder mRecorder;

    private String path; //文件路径

    private File recordFile; //录音文件

    private FragmentActivity mActivity;


    private Handler mHandler = new Handler();

    private AudioRecoderDialog recoderDialog;

    private long startTime; //开始录制时间 为了计算dialog上显示的录制时间


    /**
     * 私有化构造函数 单例模式
     */
    public MRecordUtil(FragmentActivity activity) {
        this(activity, Environment.getExternalStorageDirectory() + File.separator + AppUtils.getAppName() + File.separator + "record");
    }

    /**
     * 私有化构造函数 单例模式
     */
    public MRecordUtil(FragmentActivity activity, String path) {
        this.mActivity = activity;
        this.path = path;
        init();
    }


    /**
     * 基础初始化
     */
    private void init() {
        recoderDialog = new AudioRecoderDialog(mActivity);
        recoderDialog.setShowAlpha(0.98f);
        checkPath();
    }

    /**
     * 检查路径是否存在 如果路径已存在的话生存相关目录
     */
    private void checkPath() {
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }
    }

    /**
     * 开始录音
     */
    public void start(final View view) {
        if (mRecorder != null && mRecorder.isRecording()) return;
        MPermissions.getInstance().request(mActivity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, new MPermissions.PermissionListener() {
            @Override
            public void callBack(boolean value) {
                if (value) {
                    try {
                        mRecorder = new MP3Recorder(recordFile = new File(path, getRecordName()));
                        mRecorder.start();
                        startTime = System.currentTimeMillis();
                        recoderDialog.showAtLocation(view, Gravity.CENTER, 0, 0);
                        updateState();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }


    public void stop() {
        if (mRecorder != null && mRecorder.isRecording()) {
            mRecorder.stop();
            recoderDialog.dismiss();
        }
    }

    /**
     * 更新装填
     */
    private void updateState() {
        if (mRecorder != null && mRecorder.isRecording()) {
            double ratio = (double) mRecorder.getRealVolume();
            double db = 0;// 分贝
            if (ratio > 1) {
                db = 20 * Math.log10(ratio);
                recoderDialog.setLevel((int) db);
                recoderDialog.setTime(System.currentTimeMillis() - startTime);
            }
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    updateState();
                }
            }, 100);
        }
    }

    public File getRecordFile() {
        if (recordFile != null && recordFile.exists()) {
            return recordFile;
        }
        return null;
    }


    private String getRecordName() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return "record_" + sf.format(new Date()) + ".mp3";
    }


}
