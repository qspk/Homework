package t8;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("李四", "9528", 15000.0);
        Coder coder = new Coder("张三", "9527", 10000.0, 2000.0);
        coder.work();
        manager.work();
    }
}
