package t2;

import java.util.ArrayList;

/**
 * 案例2.影片信息在程序中的表示
 * 需求
 * 某影院系统需要在后台存储上述三部电影，然后依次展示出来。
 */
public class Test {
    public static void main(String[] args) {
        Movie m1 = new Movie("电影1",9.1,"演员1");
        Movie m2 = new Movie("电影2",8.4,"演员2");
        Movie m3 = new Movie("电影3",8.1,"演员3");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        for (Movie m :movies) {
            printInfo(m);
        }
        movies.forEach(Test::printInfo);
    }

    private static void printInfo(Movie m) {
        System.out.println("电影名称:" + m.getName());
        System.out.println("电影评分:" + m.getScore());
        System.out.println("电影演员:" + m.getActor());
        System.out.println("--------------------");
    }
}
