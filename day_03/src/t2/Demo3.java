package t2;

public class Demo3 {
    public static void main(String[] args) {
        // 请在此处调用Inner类中的method方法
        new Outer().new Inner().method();
    }
}
class Outer {
    int num = 10;
    class Inner {
        int num = 20;
        public void method(){
            int num = 30;
            // ---完善代码---
            System.out.println(num);       // 输出30
            System.out.println(this.num);       // 输出20
            System.out.println(Outer.this.num);       // 输出10
        }
    }
}
