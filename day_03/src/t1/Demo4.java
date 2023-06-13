package t1;

public class Demo4 {
    public static void main(String[] args) {
        Outer.method().show();
    }
}

interface Inter {
    void show();
}

class Outer {
    //补齐代码
    public static Inter method() {
        return new Inter() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}


