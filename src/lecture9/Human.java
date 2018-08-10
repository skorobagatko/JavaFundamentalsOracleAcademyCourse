package lecture9;

import java.util.Objects;

public class Human {

    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 100;
    private static final int MIN_NAME_LENGTH = 2;
    private String name;
    private int age;

    public Human() {

    }

    public Human(String name, int age) throws HumanWrongAgeException, HumanWrongNameException {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws HumanWrongNameException {
        if (name == null || name.length() < MIN_NAME_LENGTH) {
            throw new HumanWrongNameException("Wrong name length. Name length must be >= " + MIN_NAME_LENGTH);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws HumanWrongAgeException {
        if (age < MIN_AGE || age > MAX_AGE) {
            throw new HumanWrongAgeException("Wrong age. Age must be from " + MIN_AGE + " to " + MAX_AGE);
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
