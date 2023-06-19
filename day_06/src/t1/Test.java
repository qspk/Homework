package t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * 1、某个班级的考试在系统上进行，成绩大致为：98, 77, 66, 89, 79, 50, 100
 * 现在需要先把成绩低于80分以下的数据去掉。
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {98,77,66,89,79,50,100};
        ArrayList<Integer> scores = new ArrayList<>();
        for (int i : arr) {
            scores.add(i);
        }

        scores.removeIf(score -> score<80);

        Iterator<Integer> it = scores.iterator();
        while (it.hasNext()) {
            if (it.next() < 80) {
                it.remove();
            }
        }
        System.out.println(scores);
    }
}
