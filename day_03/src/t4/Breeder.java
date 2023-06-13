package t4;

public class Breeder {
    public void feeding(Animal animal) {
        System.out.println("喝水");
        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.eat();
            d.swim();
        }else if (animal instanceof Sheep) {
            Sheep sheep = (Sheep) animal;
            sheep.eat();
        }else if (animal instanceof Frog) {
            Frog frog = (Frog) animal;
            frog.eat();
            frog.swim();
        }
    }


}
