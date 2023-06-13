package t5;

public class Test {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.useUsb(new Mouse());
        laptop.useUsb(new KeyBoard());
        laptop.powerOff();
    }
}
