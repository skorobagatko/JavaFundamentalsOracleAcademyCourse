package practice3;

import java.util.Objects;

public class ComissionWorker extends Employee {

    private static final int SALES_PERCENTAGE = 10;
    private static final int DEFAULT_SALARY = 800;
    private static final int PRICE_PER_ITEM = 100;

    private int baseSalary;
    private int salesNumber;

    public ComissionWorker(int id, String name) {
        super(id, name);
    }

    @Override
    public int getSalary() {
        return baseSalary + (PRICE_PER_ITEM * salesNumber) / SALES_PERCENTAGE;
    }

    public int getBaseSalary() {
       return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSalesNumber() {
        return salesNumber;
    }

    public void setSalesNumber(int salesNumber) {
        this.salesNumber = salesNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComissionWorker that = (ComissionWorker) o;
        return baseSalary == that.baseSalary &&
                salesNumber == that.salesNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseSalary, salesNumber);
    }

    @Override
    public String toString() {
        return "ComissionWorker{" +
                "baseSalary=" + baseSalary +
                ", salesNumber=" + salesNumber +
                '}';
    }
}
