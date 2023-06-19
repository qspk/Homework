package t1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *  请使用字节流，把“E:\itcast\窗里窗外.txt”文件，复制到模块目录下的“窗里窗外.txt”。
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        try-with-resource
        try (
                InputStream is = new FileInputStream("E:\\itcast\\窗里窗外.txt");
                OutputStream os = new FileOutputStream("D:\\study\\Homework\\day_09\\copy.txt")

        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
