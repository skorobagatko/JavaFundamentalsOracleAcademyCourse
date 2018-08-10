package lecture5;

public class App {

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println("------------------------");
        A a2 = new A();
        System.out.println("------------------------");
        A a3 = new A();
    }

}

class A {
    static Field staticField1 = new Field("static field 1");
    Field instanceField1 = new Field("instance field 1");

    {
        System.out.println("Init block");
    }

    public A() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static init block");
    }

    static Field staticField2 = new Field("static field 2");
    Field instanceField2 = new Field("instance field 2");
}

class Field {
    public Field(String s) {
        System.out.println(s);
    }
}