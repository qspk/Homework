package t1;

import lombok.AllArgsConstructor;

public class Dog extends Animal implements Sports {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak(String str) {
        System.out.println(getName() + "说: " + str);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"狗刨中");
    }

    public void goPlay() {
        String str = "我去玩了";
        speak(str);
        swimming();
    }
}
