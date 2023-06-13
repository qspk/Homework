package t7;

public class Phone {
    public static int size = 6;
    private String brand;
    private double price;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * 获取
     * @return size
     */
    public static int getSize() {
        return size;
    }

    /**
     * 设置
     * @param size
     */
    public static void setSize(int size) {
        Phone.size = size;
    }

    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }

    public void playGame() {
        System.out.println("打游戏");
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Phone{size = " + size + ", brand = " + brand + ", price = " + price + "}";
    }
}
