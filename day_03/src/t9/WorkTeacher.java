package t9;

public class WorkTeacher extends Teacher{
    public WorkTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("就业班老师讲JavaEE");
    }
}
