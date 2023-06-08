package test1_1.entry;

import test1_1.server.AliyunSendMsg;
import test1_1.server.SendMassage;
import test1_1.server.TencentSendMsg;

import java.util.Scanner;

public class Entry {

    public static void main(String[] args) {

        // 请输入手机号码
        Scanner sc = new Scanner(System.in) ;
        System.out.print("请您输入登录的手机号码: ");
        String phone = sc.nextLine();

        // 调用发送短信类的方法发送短信验证码
        //阿里云
        SendMassage sendMsg1 = new AliyunSendMsg() ;
        sendMsg1.sendMsg(phone);
        //腾讯云
        SendMassage sendMsg2 = new TencentSendMsg() ;
        sendMsg2.sendMsg(phone);

    }

}
