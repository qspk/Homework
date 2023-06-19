package t3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 3、案例3.学生信息系统的数据搜索
 */
public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("2020212201","小王",22,"计算机科学与技术1班"));
        students.add(new Student("2020213201","小刘",20,"软件工程1班"));
        students.add(new Student("2020212511","小李",21,"土木工程1班"));
        students.add(new Student("2020217251","小李",21,"电子商务1班"));
        System.out.println("学号"+"\t\t\t"+"姓名"+"\t"+"年龄"+"\t"+"班级");
        for (Student s : students) {
            System.out.println(s.getStudentId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getClassName());
        }

        while (true) {
            System.out.println("请输入要查询的学号:");
            String id = sc.next();
            Student student = getById(students, id);
            if (student == null) {
                System.out.println("学号不存在请检查后重试!");
            } else {
                System.out.println("查找成功,学生信息如下");
                System.out.println(student.getStudentId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getClassName());
            }
        }
    }

    private static Student getById(ArrayList<Student> students, String id) {
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
