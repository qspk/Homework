package t2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *  复制图片 - 一次读取多个字节
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        try-with-resource
        try (
                InputStream is = new FileInputStream("E:\\itcast\\nm.png");
                OutputStream os = new FileOutputStream("D:\\study\\Homework\\day_09\\mn.png")

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
