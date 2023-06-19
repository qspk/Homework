package t4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * 现已知有一个文件（文件保存在模块目录下names.txt）里面存储了班级同学的姓名，每一个姓名占一行。
 * 请编写程序实现随机获取到其中一个同学的姓名。（随机点名器）
 */
public class Test {
    public static void main(String[] args) {
        //将文件中的全部信息都读取出来在做处理
        //定义一个数组存储姓名
        ArrayList<String> names = new ArrayList<>();
        File f = new File("day_09/names.txt");
        try (FileInputStream fis = new FileInputStream("day_09/names.txt")) {
            int len;
            int size = (int) f.length();
            byte[] bytes = new byte[size];
            while ((len = fis.read(bytes, 0, size)) != -1) {
                //将读取到的字节流 转换成字符串,再将字符串中的名字截取出来,分割附为回车==System.lineSeparator()
                String[] nameStrArr = new String(bytes).split(System.lineSeparator());
                for (String s : nameStrArr) {
                    names.add(s);
                }
//                names.addAll(Arrays.asList(nameStrArr));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("姓名如下:");
        System.out.println(names);
        System.out.println("随机点名开始,幸运儿为:");
        System.out.println(names.get(new Random().nextInt(names.size())));
    }
}
