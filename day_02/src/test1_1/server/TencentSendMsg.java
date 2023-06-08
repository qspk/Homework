package test1_1.server;

import test1_1.domain.CheckCode;

import java.util.ArrayList;

public class TencentSendMsg extends SendMassage{

    // 存储短信验证码的集合
    public static ArrayList<CheckCode> arrayList = new ArrayList<>() ;

    @Override
    public void printInfo() {
        CheckCode checkCode0 = getCheckCode();
        arrayList.add(0,checkCode0);
        for (CheckCode checkCode : arrayList) {
            if (checkCode.getPhone().equals(checkCode0.getPhone())) {
                System.out.println("访问腾讯云短信平台给"+checkCode.getPhone()+"发送验证码"+checkCode.getCode());
            }
        }
    }

}
