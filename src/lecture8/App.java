package lecture8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        Clothing clothing = new Shirt("Red shirt", 100, 40);
        System.out.println(clothing);
        clothing.wash();
        System.out.println(clothing);

        Clothing[] clothingArray = {
                new Shirt("Red shirt", 100, 40),
                new Jeans("Levis", 250),
                new Shirt("Green shirt", 100, 40),
                new Jeans("Wrangler", 190)
        };

        for (Clothing c : clothingArray) {
            c.wash();
        }

        String classNameFromPropertyFile = new BufferedReader(new FileReader("property")).readLine();
        List<String> stringList = (List<String>) Class.forName(classNameFromPropertyFile).newInstance();
        stringList.add("hello");
        stringList.add("world");
        System.out.println(stringList);

        Loundry loundry = new Loundry();
        loundry.clean(clothing);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Arrays.sort(clothingArray);
        for (Clothing c : clothingArray) {
            System.out.println(c);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Arrays.sort(clothingArray, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        for (Clothing c : clothingArray) {
            System.out.println(c);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Arrays.sort(clothingArray, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Arrays.asList(clothingArray).forEach(System.out::println);
    }
}
