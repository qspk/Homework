package t2;

public interface RedRay {
    void control(TV tv);

    public default void connecting() {
        System.out.println("外接设备,连接成功,可以使用红外线");
    }
}
