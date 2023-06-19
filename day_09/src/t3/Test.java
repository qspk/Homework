package t3;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * 将这些信息保存至当前模块下的name.txt文件中，每个名字占据一行的位置
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Lucy");
        list.add("Lily");
        list.add("John");
        list.add("Kevin");

        try (
                FileOutputStream fos = new FileOutputStream("day_09/names.txt");
                )
        {
            for (String s : list) {
                fos.write(s.getBytes(StandardCharsets.UTF_8));
                fos.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));

            }
            System.out.println("写入成功");
          /*  list.forEach(s -> {
                try {
                    fos.write(s.getBytes(StandardCharsets.UTF_8));
                    fos.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
                    System.out.println("写入成功");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });*/

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
