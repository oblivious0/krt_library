package krt.wid.nohttp.bean;

/**
 * author:Marcus
 * create on:2020/4/22 10:35
 * description
 */
public class TestBean {
    private String app_id;
    private String signature;
    private String params;
    private String timestamp;
    private String method;

    public String getApp_id() {
        return app_id;
    }

    public String getSignature() {
        return signature;
    }

    public String getParams() {
        return params;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getMethod() {
        return method;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
