package practice3;

import java.util.Objects;

public class Boss extends Employee {

    private static final int DEFAULT_SALARY = 1000;
    private int salary;

    public Boss(int id, String name) {
        this(id, name, DEFAULT_SALARY);
    }

    public Boss(int id, String name, int salary) {
        super(id, name);
        setSalary(salary);
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Boss boss = (Boss) o;
        return salary == boss.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary);
    }

    @Override
    public String toString() {
        return "Boss{" +
                "salary=" + salary +
                '}';
    }
}
