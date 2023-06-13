package t5;

public class Test {
    public static void main(String[] args) {
        new InterA() {
            @Override
            public void show() {
                System.out.println("InterA");
            }
        }.show();
        InterA a = () -> System.out.println("InterA...Lambda");
        a.show();

        new InterB() {
            @Override
            public void method(int num) {
                System.out.println("InterB..."+num);
            }
        }.method(3);
        InterB b = num -> System.out.println("InterB..."+num+"...Lambda");
        b.method(3);

        new InterC() {
            @Override
            public String function() {
                System.out.println("InterC");
                return null;
            }
        }.function();
        InterC c = ()->{
            System.out.println("InterC...Lambda");
            return null;
        };
        c.function();

        new InterD() {
            @Override
            public int niubility(int num) {
                System.out.println("InterD..." + num);
                return num;
            }
        }.niubility(4);
        InterD d = num -> {
            System.out.println("InterD..." + num + "...Lambda");
            return num;
        };
        d.niubility(4);

    }
}

//InterA
interface InterA {
    public abstract void show();
}

//InterB
interface InterB {
    public abstract void method(int num);
}

//InterC
interface InterC {
    public abstract String function();
}

//InterD
interface InterD {
    public abstract int niubility(int num);
}