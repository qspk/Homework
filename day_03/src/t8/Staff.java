package t8;

public abstract class Staff {
    private String name;
    private String id;
    private double salary;

    public abstract void work();

    public Staff() {
    }

    public Staff(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Staff{name = " + name + ", id = " + id + ", salary = " + salary + "}";
    }
}
