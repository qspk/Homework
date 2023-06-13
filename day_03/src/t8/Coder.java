package t8;

public class Coder extends Staff {
    private double bonus;

    @Override
    public void work() {
        System.out.println("姓名为:" + getName() + ",工号为:" + getId() + ",工资为:" + getSalary() + ",奖金为:" + bonus + ",的程序员正在编写代码");
    }


    public Coder() {
    }

    public Coder(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
}
