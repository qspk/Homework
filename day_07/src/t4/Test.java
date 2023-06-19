package t4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        Collections.addAll(scores,98, 77, 66, 89, 79, 50, 100);
        ArrayList<Integer> scores2 = new ArrayList<>(scores);
        ArrayList<Integer> scores3 = new ArrayList<>(scores);
        ArrayList<Integer> scores4 = new ArrayList<>(scores);

        //方式一 fori 顺
        method1(scores);
        //方法二 fori 逆
        method2(scores2);
        //方法三 removeIf()
        method3(scores3);
        //方法四 Iterator
        method4(scores4);
    }

    private static void method4(ArrayList<Integer> scores4) {
        Iterator<Integer> it = scores4.iterator();
        while (it.hasNext()) {
            if (it.next() < 80) {
                it.remove();
            }
        }
        System.out.println(scores4);
    }

    private static void method3(ArrayList<Integer> scores3) {
        scores3.removeIf((Integer i) -> i < 80);
        System.out.println(scores3);
    }

    private static void method2(ArrayList<Integer> scores2) {
        for (int i = scores2.size() - 1; i > 0; i--) {
            if (scores2.get(i) < 80) {
                scores2.remove(i);
            }
        }
        System.out.println(scores2);
    }

    private static void method1(ArrayList<Integer> scores) {
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < 80) {
                scores.remove(i);
                i--;
            }
        }
        System.out.println(scores);
    }
}
