package test1_2.house;

public class HouseTwo extends HouseTemplate {
    public HouseTwo(String name) {
        super(name);
    }

    @Override
    void base() {
        System.out.println(name + "的地基使用钢铁地基");
    }

    @Override
    void wall() {
        System.out.println(name + "的墙使用大理石建造");
    }

    @Override
    void door() {
        System.out.println(name + "的门要采用防盗门");

    }

    @Override
    void windows() {
        System.out.println(name + "的窗户要向北方");
    }
}
