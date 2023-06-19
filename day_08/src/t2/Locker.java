package t2;

import java.util.Map;

public class Locker {
    private int numbers;
    private Map<String,String> goods;


    public Locker() {
    }

    public Locker(int numbers) {
        this.numbers = numbers;
    }

    public Locker(int numbers, Map<String, String> goods) {
        this.numbers = numbers;
        this.goods = goods;
    }

    /**
     * 获取
     * @return numbers
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * 设置
     * @param numbers
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    /**
     * 获取
     * @return goods
     */
    public Map<String, String> getGoods() {
        return goods;
    }

    /**
     * 设置
     * @param goods
     */
    public void setGoods(Map<String, String> goods) {
        this.goods = goods;
    }

    public String toString() {
        return "Lock{numbers = " + numbers + ", goods = " + goods + "}";
    }
}
