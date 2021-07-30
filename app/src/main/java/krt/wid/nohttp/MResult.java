package krt.wid.nohttp;

import krt.wid.http.Result;

/**
 * @author Marcus
 * @package krt.wid.nohttp
 * @description
 * @time 2018/12/6
 */
public class MResult<T> extends Result<T> {
    @Override
    public boolean isSuccess() {
        return code == 0;
    }
}
