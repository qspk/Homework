package t8;

public class Manager extends Staff {
    @Override
    public void work() {
        System.out.println("姓名为:"+getName()+",工号为:"+getId()+",工资为:"+getSalary()+"的项目经理正在管理程序员写代码");
    }

    public Manager() {
    }

    public Manager(String name, String id, double salary) {
        super(name, id, salary);
    }


}
