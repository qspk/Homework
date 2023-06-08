package test2_interface;

import java.util.ArrayList;

public class ClassManager {
    private static ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperatorImpl_2();

    static{
        students.add(new Student("迪丽热巴", '女', 99));
        students.add(new Student("古力娜扎", '女', 100));
        students.add(new Student("马尔扎哈", '男', 80));
        students.add(new Student("卡尔扎巴", '男', 60));
    }

/*  //构造器 创建对象时初始化集合信息
    public ClassManager(){
        students.add(new Student("迪丽热巴", '女', 99));
        students.add(new Student("古力娜扎", '女', 100));
        students.add(new Student("马尔扎哈", '男', 80));
        students.add(new Student("卡尔扎巴", '男', 60));
    }
*/

    public void printInfo() {
        studentOperator.printAllInfo(students);
    }
    public void printScore() {
        studentOperator.printAverageScore(students);
    }


}
