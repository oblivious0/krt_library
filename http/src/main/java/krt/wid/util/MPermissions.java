package krt.wid.util;

import android.annotation.SuppressLint;

import androidx.fragment.app.FragmentActivity;

import com.tbruyelle.rxpermissions2.RxPermissions;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/**
 * author:Marcus
 * create on:2019/3/19 10:56
 * description
 */
public class MPermissions {

    private static class SingletionHolder {
        private static final MPermissions instance = new MPermissions();

    }

    public static MPermissions getInstance() {
        return SingletionHolder.instance;
    }

    public interface PermissionListener {
        void callBack(boolean value);
    }


    private MPermissions() {

    }

    /**
     * 设置多个权限
     *
     * @param permissions
     * @param listener
     */
    @SuppressLint("checkResult")
    public void request(FragmentActivity activity, String[] permissions, final PermissionListener listener) {
        RxPermissions rxPermissions = new RxPermissions(activity);
        rxPermissions.request(permissions)
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean aBoolean) throws Exception {
                        if (listener != null) listener.callBack(aBoolean);
                    }
                });
    }

    /**
     * 设置单个权限
     */
    @SuppressLint("checkResult")
    public void request(FragmentActivity activity, String permissions, final PermissionListener listener) {
        RxPermissions rxPermissions = new RxPermissions(activity);
        rxPermissions.request(permissions)
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean aBoolean) throws Exception {
                        if (listener != null) listener.callBack(aBoolean);
                    }
                });
    }


}
