package test2_interface;

import java.util.ArrayList;

public class StudentOperatorImpl_2 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        int count1 = 0; //男生人数
        int count2 = 0; //女生人数
        System.out.println("------全班学生信息如下------");
        for (Student student : students) {
            System.out.println("姓名：" + student.getName() + ", 性别：" + student.getSex() + ", 成绩：" + student.getScore());
            if (student.getSex() == '男') {
                count1++;
            } else if (student.getSex() == '女') {
                count2++;
            }
        }
        System.out.println("班级男生人数:" + count1);
        System.out.println("班级男生人数:" + count2);
        System.out.println("班级男生人数:" + students.size());
        System.out.println("-------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double sumScore = 0.0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (Student student : students) {
            sumScore += student.getScore();
            if (max < student.getScore()) {
                max = student.getScore();
            }
            if (min > student.getScore()) {
                min = student.getScore();
            }
        }
        System.out.println("班级最高分: " + max);
        System.out.println("班级最低分: " + min);
        System.out.println("平均成绩: " + (sumScore / students.size()));
    }
}
