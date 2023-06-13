package t2;

public class Test {
    public static void main(String[] args) {
        TV tv = new TV("长虹");
        new ReMoteControl().controlTv(tv);
        new Phone().control(tv);

    }
}
