package krt.wid.nohttp;

import android.util.Log;

import com.lzy.okgo.request.base.ProgressRequestBody;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


/**
 * @author Marcus
 * @package krt.wid
 * @description
 * @time 2018/10/19
 */
public class TestInterceptor implements Interceptor {
    public TestInterceptor() {

    }

    @Override

    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder builder = request.newBuilder()
                .addHeader("accessToken", "78fedefa-cbb9-406e-a674-dd9ae06d679b");
        return chain.proceed(builder.build());
    }
}
