package lecture4;

public class App {

    public static void main(String[] args) {
        Human human = new Human("John", 20);
        System.out.println(human);

        f(1);
    }

    public static void f(int i) {
        System.out.println(i);
        f(i+1);
    }
}
