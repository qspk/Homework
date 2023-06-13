package t7;

public class SmartPhone extends Phone{
    @Override
    public void call() {
        super.call();
        System.out.println("视频通话");
    }

    public SmartPhone() {
    }

    public SmartPhone(String brand, double price) {
        super(brand, price);
    }
}
