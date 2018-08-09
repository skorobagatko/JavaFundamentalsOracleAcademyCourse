package practice4;

import practice4.exception.StudentWrongAgeException;
import practice4.exception.StudentWrongNameException;

import java.util.Objects;

public class Student {

    private static int ID_COUNTER = 0;
    private static final int MIN_AGE = 17;
    private static final int MAX_AGE = 35;
    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NAME_LENGTH = 100;

    private final int id = ++ID_COUNTER;
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String name) throws StudentWrongAgeException, StudentWrongNameException {
        setAge(age);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws StudentWrongAgeException {
        if (age < MIN_AGE || age > MAX_AGE) {
            throw new StudentWrongAgeException("Wrong age. The age must be >= "
                    + MIN_AGE + " and <= " + MAX_AGE);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws StudentWrongNameException {
        if (name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
            throw new StudentWrongNameException("The name length must be >= "
                    + MIN_NAME_LENGTH + " and <= " + MAX_NAME_LENGTH);
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
