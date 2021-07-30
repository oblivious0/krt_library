package krt.wid.nohttp;

import com.jaeger.library.StatusBarUtil;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import krt.wid.base.MBaseActivity;
import krt.wid.bean.event.MEventBean;
import krt.wid.util.MConstants;
import krt.wid.util.MLogUtil;

/**
 * @author Marcus
 * @package krt.wid.nohttp
 * @description
 * @time 2018/2/7
 */

public abstract class BaseActivity extends MBaseActivity {
    private Unbinder unbinder;

    @Override
    public void init() {

    }

    @Override
    public void beforeBindLayout() {

    }

    @Override
    public void bindButterKnife() {
        unbinder = ButterKnife.bind(this);
    }

    @Override
    public void unbindButterknife() {
        unbinder.unbind();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void baseEvent(MEventBean bean) {
        if (bean.action == MConstants.ACTION_RESULT_CODE) {
            int code = (int) bean.result;
        }
    }

}
