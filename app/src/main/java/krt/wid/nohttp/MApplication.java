package krt.wid.nohttp;

import krt.wid.base.MApp;
import krt.wid.config.BaseModule;
import krt.wid.config.BaseModuleConfig;
import pl.com.salsoft.sqlitestudioremote.SQLiteStudioService;

/**
 * @author Marcus
 * @package krt.wid.nohttp
 * @description
 * @time 2018/1/29
 */

public class MApplication extends MApp {


    @Override
    public void init() {
        SQLiteStudioService.instance().start(this);
        BaseModule.initialize(BaseModuleConfig.newBuilder()
                .setLoadingViewColor(R.color.colorPrimary)
                .setLoadingViewStyle("LineScaleIndicator")
                .addInterceptor(new TestInterceptor())
                .setConnectTimeout(15)
                .setReadTimeout(15)
                .setServerSuccessCode(200)
                .setNeedGetResult(true)
                .build());
    }
}
