package t6;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("老王", 30);
        Person p2 = new Person("老李", 25);
        Dog dog = new Dog(2,"黑颜色");
        Cat cat = new Cat(3, "灰颜色");

        p1.keepPet(dog,"骨头");
        p2.keepPet(cat,"鱼");
    }
}
