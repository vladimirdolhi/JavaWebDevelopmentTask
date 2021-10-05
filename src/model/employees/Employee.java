package model.employees;

public abstract class Employee {
    private String name;
    private String sname;
    private String position;
    private int salary;

    public Employee(String name, String sname, String position, int salary) {
        this.name = name;
        this.sname = sname;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSname() {
        return sname;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
}
