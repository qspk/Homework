package t5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 将文本内容读取出来，保存为字符串格式，并打印到控制台。
 */
public class Test {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("day_09/字符流和字节流.txt")) {
            File f = new File("day_09/字符流和字节流.txt");
            int size = (int) f.length();
            byte[] bytes = new byte[size];
//            int len; //用不到长度
            while ((fis.read(bytes, 0, size)) != -1) {
                String info = new String(bytes);
                System.out.println(info);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
