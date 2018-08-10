package lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        System.out.println(getHumanByConsoleWithCheck());
    }

    private static Human getHumanByConsoleWithCheck() {
        Human human = new Human();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new UncloseableInputStream(System.in)))) {
            while (true) {
                try {
                    System.out.print("Enter name > ");
                    String name = reader.readLine();
                    human.setName(name);
                    break;
                } catch (HumanWrongNameException e) {
                    System.out.println(e.getMessage());
                }
            }
            while (true) {
                try {
                    System.out.print("Enter age > ");
                    int age = Integer.parseInt(reader.readLine());
                    human.setAge(age);
                    break;
                } catch (HumanWrongAgeException e) {
                    System.out.println(e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Wrong number");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return human;
    }
}
