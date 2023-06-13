package t6;

public class Cat extends Animal{
    @Override
    public void eat(String something) {
        System.out.println("猫眯着眼睛侧着头吃" +something);
    }

    public void catchMouse() {
        System.out.println("猫会抓老鼠");
    }

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
}
