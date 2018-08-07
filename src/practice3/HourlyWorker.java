package practice3;

import java.util.Objects;

public class HourlyWorker extends Employee {

    private static final int PER_HOUR_SALARY = 10;
    private static final int NORMAL_WORKING_HOURS_NUMBER = 160;
    private static final int OVERTIME_COEFFICIENT = 2;

    private int workedHours;

    public HourlyWorker(int id, String name) {
        super(id, name);
    }

    @Override
    public int getSalary() {
        int salary = 0;
        if (workedHours > NORMAL_WORKING_HOURS_NUMBER) {
            salary += PER_HOUR_SALARY * NORMAL_WORKING_HOURS_NUMBER;
            int overtimeHours = workedHours - NORMAL_WORKING_HOURS_NUMBER;
            salary += overtimeHours * OVERTIME_COEFFICIENT * PER_HOUR_SALARY;
        } else {
            salary += PER_HOUR_SALARY * workedHours;
        }
        return salary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyWorker that = (HourlyWorker) o;
        return workedHours == that.workedHours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workedHours);
    }

    @Override
    public String toString() {
        return "HourlyWorker{" +
                "workedHours=" + workedHours +
                '}';
    }
}
