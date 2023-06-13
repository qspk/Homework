package t3;

public class Demo2 {
    public static void main(String[] args) {
        // 请在此处调用method方法
        method(new Dog());
    }

    public static void method(Animal a){
        a.eat();
//此处添加转型判断
        if(a instanceof Dog){
            Dog dog = (Dog) a;
            dog.watchHome();
        }
    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome(){
        System.out.println("狗看家");
    }
}
