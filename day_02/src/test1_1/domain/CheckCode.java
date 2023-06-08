package test1_1.domain;

public class CheckCode {            // 记录短信验证码的类

    private String phone ;          // 手机号码
    private String code;      // 验证码

    public CheckCode(String phone, String checkCode) {
        this.phone = phone;
        this.code = checkCode;
    }

    public CheckCode() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
