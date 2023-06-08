package test1_1.server;

import test1_1.domain.CheckCode;

import java.util.Random;

public abstract class SendMassage {
    // 定义发送短信验证码时可选的数字字符
    private final Random r = new Random();
    public char[] chs = {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9'} ;
    private CheckCode checkCode;
    String code = "";
    // 发送短信验证码的方法
    public void sendMsg(String phone) {
        //随机从chs数组中取字符,拼接字符串, -- 循环4次 ,返回
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(chs.length);
            code += chs[index];
        }
        checkCode = new CheckCode(phone,code);
        printInfo();
    }

    public abstract void printInfo();

    public CheckCode getCheckCode() {
        return checkCode;
    }
}
