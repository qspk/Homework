package t4;

/**
 * Lambda 表达式
 */
public class Test {
    public static void main(String[] args) {
        useAnimal(new Animal() {
            @Override
            public void eat() {
                System.out.println("流浪狗,捡垃圾吃");
            }
        });

        useAnimal(()-> System.out.println("吃腻了狗粮"));
    }

    public static void useAnimal(Animal animal) {
        animal.eat();
    }
}
