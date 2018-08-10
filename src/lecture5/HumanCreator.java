package lecture5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanCreator {

    public static void main(String[] args) throws IOException {
        System.out.println(createHuman());
    }

    public static Human createHuman() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input name: ");
        String name = reader.readLine();
        System.out.print("Input age: ");
        int age = Integer.parseInt(reader.readLine());
        return new Human(name, age);
    }
}
