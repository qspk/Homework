package t3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("JavaEE企业级开发指南");
        books.add("Oracle高级编程");
        books.add("Oracle从入门到精通");
        books.add("Java架构师之路");
        books.add("Java核心思想");

        System.out.println("------打印所有书籍-------");
        for (String book : books) {
            System.out.println(book);
        }

        System.out.println("------书名字符小于10-----");
        for (String book : books) {
//            char[] ch = book.toCharArray();
            if (book.length() < 10) {
                System.out.println(book);
            }
        }

        System.out.println("--------包含java--------");
        for (String book : books) {
            if (book.contains("Java")) {
                System.out.println(book);
            }
        }

        //使用removeIf() 方法删除书籍
        System.out.println("----删掉含Oracle书籍------");
        books.removeIf(s -> s.contains("Oracle"));
        for (String book : books) {
            System.out.println(book);
        }
    }
}
