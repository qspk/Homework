package t9;

public class Test {
    public static void main(String[] args) {
        BaseTeacher bt = new BaseTeacher("张三", 23);
        WorkTeacher wt = new WorkTeacher("李四", 24);
        bt.show();
        wt.show();

    }
}
