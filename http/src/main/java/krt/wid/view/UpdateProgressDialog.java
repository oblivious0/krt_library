package krt.wid.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.daimajia.numberprogressbar.NumberProgressBar;

import krt.wid.http.R;

/**
 * author:Marcus
 * create on:2019/4/15 19:15
 * description
 */
public class UpdateProgressDialog extends Dialog {
    private NumberProgressBar bar;

    private FrameLayout bg;

    public UpdateProgressDialog(Context context) {
        this(context, R.style.progressDialog);
    }

    public UpdateProgressDialog(Context context, int themeResId) {
        super(context, R.style.progressDialog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_update_progress);
        bg = findViewById(R.id.bg);
        bar = findViewById(R.id.progress);
        setCanceledOnTouchOutside(false);
        setOnShowListener(new OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                YoYo.with(Techniques.BounceInDown)
                        .duration(8 * 100)
                        .playOn(bg);
            }
        });
    }

    public void setProgress(int progress) {
        bar.setProgress(progress);
    }
}
