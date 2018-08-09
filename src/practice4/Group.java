package practice4;

import practice4.exception.StudentWrongAgeException;
import practice4.exception.StudentWrongNameException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Group{

    private final Student[] students;

    public Group(int studentsNumber) {
        students = new Student[studentsNumber];
    }

    public void fillByConsole() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < students.length; i++) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("        Student " + (i + 1));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Student student = new Student();
            try {
                while (true) {
                    try {
                        System.out.print("Enter age > ");
                        int age = Integer.parseInt(reader.readLine());
                        student.setAge(age);
                        break;
                    } catch (StudentWrongAgeException e) {
                        System.out.println(e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong age. Age must be a number.");
                    }
                }
                while (true) {
                    try {
                        System.out.print("Enter name > ");
                        String name = reader.readLine();
                        student.setName(name);
                        break;
                    } catch (StudentWrongNameException | NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } catch (IOException e) {
                // NOP
            }
            students[i] = student;
        }
    }

    public void print() {
        Arrays.stream(students).forEach(System.out::println);
    }
}
