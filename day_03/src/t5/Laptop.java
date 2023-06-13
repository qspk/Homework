package t5;

public class Laptop {
    public void powerOn() {
        System.out.println("笔记本开机");
    }
    public void powerOff() {
        System.out.println("笔记本关机");
    }

    public void useUsb(Usb usb) {
        usb.open();
        usb.close();
    }
}
