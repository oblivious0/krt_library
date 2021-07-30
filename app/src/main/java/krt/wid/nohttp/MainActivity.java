package krt.wid.nohttp;

import android.Manifest;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Environment;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import androidx.core.app.NotificationCompat;

import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.EncodeUtils;
import com.czt.mp3recorder.MP3Recorder;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;
import com.zhihu.matisse.Matisse;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.engine.impl.GlideEngine;
import com.zhihu.matisse.internal.entity.CaptureStrategy;


import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import krt.wid.http.LoadingDialog;
import krt.wid.http.MCallBack;
import krt.wid.http.Result;
import krt.wid.inter.UploadCallBack;
import krt.wid.nohttp.bean.Marcus;
import krt.wid.nohttp.bean.ParamsBean;
import krt.wid.nohttp.bean.TestBean;
import krt.wid.record.MRecordUtil;
import krt.wid.util.MGlideUtil;
import krt.wid.util.MPermissions;
import krt.wid.util.MPickUtil;
import krt.wid.util.MTitle;
import krt.wid.util.MUpdate;
import krt.wid.util.MUpload;
import krt.wid.util.ParseJsonUtil;


public class MainActivity extends BaseActivity {
    private String url = "https://www.krtservice.com/sc-api/api/user/loginByYzm";

    private String url_1 = "http://111.75.240.74:8091/agz_api/api/queryFirstScreen";

    private String get_url = "https://www.krtservice.com/sc-api/api/sms/checkYzm";

    private int count;


    private boolean isExit;

    LoadingDialog mLoadingDialog;


    NotificationManager manager;

    NotificationCompat.Builder builder;

    private MTitle title;

    private String path;

    private String value;

    private MP3Recorder mRecorder;

    private File file;

    private String recordPath;

    private MRecordUtil mUtil;

    private ImageView imageView;

    private String demo = "eyJjaGVja190eXBlIjoxLCJjb2RlIjoiNDUzNDIzIiwic2FsZXJpZCI6Ijc4ODMyMyJ9";

    private String test = "{\"app_id\":\"34838153\",\"signature\":\"ad4f97b2eab55f8556bd0f4c2ab34612\",\"params\":\"eyJjaGVja190eXBlIjoxLCJjb2RlIjoiMTc2MzI5Iiwic2FsZXJpZCI6IjYwMDIwMTcxIn0=\",\"timestamp\":1587528056,\"method\":\"Check_Order\"}";


    @Override

    public int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        MTitle title = findViewById(R.id.title);
        title.setCenterText("我是白色标题怎么了", 20);
        mUtil = new MRecordUtil(this);
        path = "/storage/emulated/0/Pictures/CoolMarket/ac0273631a8d6e4d07a598db22ab587c.jpg";
        recordPath = Environment.getExternalStorageDirectory() + File.separator + AppUtils.getAppName();
        imageView = findViewById(R.id.img);
        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OkGo.<Result<Marcus>>post("https://www.ly3618.com:443/tour-api-test/api/agreeInfo")
                        .params("agreeType", 1)
                        .params("appType", "android")
                        .params("tag", "krt007")
                        .execute(new MCallBack<Result<Marcus>>(MainActivity.this) {

                            @Override
                            public void onSuccess(Response<Result<Marcus>> response) {

                            }
                        });
            }
        });
        findViewById(R.id.stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MGlideUtil.gray = false;
                MGlideUtil.loadTransform(MainActivity.this, R.mipmap.banner1, R.mipmap.bg, new RoundedCornersTransformation(40, 0), imageView);
            }
        });

    }

    @Override
    public void loadData() {

    }

    private TestBean test() {
        TestBean bean = new TestBean();
        bean.setApp_id("34838153");
        bean.setMethod("Check_Order");
        bean.setParams(getParams());
        bean.setSignature(getSignature());
//        bean.setTimestamp(System.currentTimeMillis() / 1000 + "");'
        bean.setTimestamp("1587537305");
        return bean;
    }

    private String getParams() {
        ParamsBean bean = new ParamsBean();
        bean.setCheck_type(1);
        bean.setCode("937856");
        bean.setSalerid("60020171");
        return Base64Util.encode(ParseJsonUtil.toJson(bean).getBytes(), 0, ParseJsonUtil.toJson(bean).length());
    }

    private String getSignature() {
        String params = getParams();
        String method = "Check_Order";
//        String timestamp = System.currentTimeMillis() / 1000 + "";
        String timestamp = "1587537305";
        String secret = "245f1ccdd82b240fcd3853319e818f7e";
        String content = method + secret + timestamp + params;
        Log.w("marcus", "sign:" + Md5Util.encoderByMd5With32Bit(Md5Util.encoderByMd5With32Bit(content)));
        return Md5Util.encoderByMd5With32Bit(Md5Util.encoderByMd5With32Bit(content));
    }
}
