package krt.wid.nohttp;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import krt.wid.util.MTimeUtil;

/**
 * author:Marcus
 * create on:2020/5/19 10:49
 * description
 */
public class Test {

    public static void main(String[] args) {
        try {
            String phone = "13387979225";
            String content = AESUtil.getAESEncrypt(phone, "fM@nF3z4O3lGym8o");
            System.out.print(content.equals("4B7B8162C566D31641EF870EA3542C04"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
