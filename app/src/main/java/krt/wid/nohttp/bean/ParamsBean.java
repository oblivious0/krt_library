package krt.wid.nohttp.bean;

/**
 * author:Marcus
 * create on:2020/4/22 10:43
 * description
 */
public class ParamsBean {

    /**
     * check_type : 1
     * code : 453423
     * salerid : 78832 3
     */

    private int check_type;
    private String code;
    private String salerid;
    private String mobile;
    private String idcard;
    private String order_batch;

    public int getCheck_type() {
        return check_type;
    }

    public void setCheck_type(int check_type) {
        this.check_type = check_type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSalerid() {
        return salerid;
    }

    public void setSalerid(String salerid) {
        this.salerid = salerid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getOrder_batch() {
        return order_batch;
    }

    public void setOrder_batch(String order_batch) {
        this.order_batch = order_batch;
    }
}
