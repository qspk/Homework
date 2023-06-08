package test2_interface;

import java.util.ArrayList;

public class StudentOperatorImpl_1 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("------全班学生信息如下------");
        for (Student student : students) {
            System.out.println("姓名：" + student.getName() + ", 性别：" + student.getSex() + ", 成绩：" + student.getScore());
        }
        System.out.println("-------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double sumScore = 0.0;
        for (Student student : students) {
            sumScore += student.getScore();
        }
        System.out.println("平均成绩: " +(sumScore/students.size()));
    }
}
