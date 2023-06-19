package t5;

import java.util.*;

/**
 * 请编写程序，可以根据年份查询该年份的冠军国家，也可以根据国家，查询该国家获得世界杯冠军的所有年份。
 */
public class Test {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> champions = new HashMap<>();
        champions.put("1954", "西德");
        champions.put("1958", "巴西");
        champions.put("1962", "巴西");
        champions.put("1966", "英格兰");
        champions.put("1970", "巴西");
        champions.put("1974", "西得");
        champions.put("1978", "阿根廷");
        champions.put("1982", "意大利");
        champions.put("1986", "阿根廷");
        champions.put("1990", "西得");
        champions.put("1994", "巴西");
        champions.put("1998", "法国");
        champions.put("2002", "巴西");
        champions.put("2006", "意大利");
        champions.put("2010", "西班牙");
        champions.put("2014", "德国");
        champions.put("2018", "法国");

        while (true) {
            System.out.println("请选择功能: 1.查找国家获得冠军的年份  2.查询某年获得冠军的国家  3.退出");
            switch (sc.next()) {
                case "1":
                    getYearsByCountry(champions);
                    break;
                case "2":
                    getCountryByYear(champions);
                    break;
                case "3":
                    return;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }

    private static void getCountryByYear(Map<String, String> champions) {
        System.out.println("请输入要查询的年份:");
        String year = sc.next();
        if (!champions.containsKey(year)) {
            System.out.println("该年份没有举办世界杯");
            return;
        }
        System.out.println(year + "年获得世界杯冠军的国家是: " + champions.get(year));
    }

    private static void getYearsByCountry(Map<String, String> champions) {
        System.out.println("请输入要查询的国家:");
        String country = sc.next();
        ArrayList<String> years = new ArrayList<>();
        champions.forEach((k, v) -> {
            if (Objects.equals(v, country)) {
                years.add(k);
            }
        });

        if (years.isEmpty()) {
            System.out.println(country + "还没有获得过世界杯冠军");
        } else {
            System.out.println(country + "获得过世界杯冠军的年份有: ");
            years.forEach(year -> {
                System.out.print(year + "\t");
            });
            System.out.println();
        }
    }


}
