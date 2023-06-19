package t1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Collections.addAll(list, 12811.12, 15335.5, 8625.6, 21288.26, 18637.78);

        for (int i = 0; i < list.size(); i++) {
            list.set(i,(list.get(i) + 200));
        }

        for (Double salary : list) {
            System.out.println(salary);
        }
    }
}
