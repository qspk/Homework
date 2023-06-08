package test1_2.entry;

import test1_2.house.HouseOne;
import test1_2.house.HouseTemplate;

public class Entry {
    public static void main(String[] args) {
        HouseTemplate h1 = new HouseOne("房子1");
        HouseTemplate h2 = new HouseOne("房子2");

        h1.buildHouse();
        h2.buildHouse();
    }
}
