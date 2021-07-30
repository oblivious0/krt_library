package krt.wid.nohttp;


import android.view.KeyEvent;



/**
 * @author Marcus
 * @package krt.wid.nohttp
 * @description
 * @time 2018/4/10
 */

public class SecondActivity extends BaseActivity {


    @Override
    public int bindLayout() {
        return R.layout.activity_second;
    }

    @Override
    public void initView() {
        getSupportFragmentManager().beginTransaction().add(R.id.frame, new TestFragment()).commit();
    }

    @Override
    public void loadData() {

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }
}
