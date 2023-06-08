package test1_2.house;

public abstract class HouseTemplate {
    String name;  //房屋名字

    public HouseTemplate(String name) {
        this.name = name;
    }

    public void buildHouse() {
    base();
    wall();
    door();
    windows();
    }

    abstract void base();   //地基
    abstract void wall();   //墙
    abstract void door();   //门
    abstract void windows();    //窗户

}
