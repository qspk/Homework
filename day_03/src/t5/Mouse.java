package t5;

public class Mouse implements Usb {

    @Override
    public void open() {
        System.out.println("连接鼠标的USB");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标的USB");
    }
}
