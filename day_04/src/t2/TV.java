package t2;

public class TV {
    private String name;

    public void play(String channel) {
        System.out.println(name + "电视正在播放" + channel + "节目");
    }


    public TV() {
    }

    public TV(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "TV{name = " + name + "}";
    }
}
