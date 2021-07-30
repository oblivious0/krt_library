package krt.wid.util;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

/**
 * @author Marcus
 * @package krt.wid.util
 * @description
 * @time 2018/3/1
 */

public class MToast {
    private static Toast toast;

    public static void showToast(Context context, String info) {
        cancelToast();
        if (toast == null) {
            toast = Toast.makeText(context, info, Toast.LENGTH_SHORT);
        }
        toast.setText(info);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    public static void showCenterToast(Context context, String info) {
        cancelToast();
        if (toast == null) {
            toast = Toast.makeText(context, info, Toast.LENGTH_SHORT);
        }
        toast.setText(info);
        toast.setDuration(Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }

    public static void showSelfToast(Context context, View view, boolean isCenter) {
        cancelToast();
        toast = new Toast(context);
        toast.setView(view);
        if (isCenter)
            toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    public static void cancelToast() {
        if (toast != null) {
            toast.cancel();
        }
        toast = null;
    }
}
