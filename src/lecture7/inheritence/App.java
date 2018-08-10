package lecture7.inheritence;

public class App {

    public static void main(String[] args) {
        Shirt shirt = new Shirt("Shirt", 150, 50);
        shirt.setName("Red Shirt");
        shirt.setPrice(100);
        System.out.println(shirt);

        shirt.color = "Red";
        Clothing clothing = shirt;
        clothing.color = "Green";

        System.out.println(shirt.color);
        System.out.println(((Clothing)shirt).color);
        System.out.println(clothing == shirt);

        shirt.setSize(50);
        shirt.wash();
        System.out.println(shirt.getSize());

        clothing.wash();
        System.out.println(shirt.getSize());

        System.out.println("===================");
        C c = new C();
    }
}

class A {
    public static Field staticFieldA = new Field("staticFieldA");
    public Field fieldA = new Field("fieldA");
    public A() {
        System.out.println("A()");
    }
    static {
        System.out.println("static init block A");
    }
}

class B extends A {
    public static Field staticFieldB = new Field("staticFieldB");
    public Field fieldB = new Field("fieldB");
    public B() {
        this(5);
        System.out.println("B()");
    }
    public B(int i) {
        System.out.println("B(int i)");
    }
    static {
        System.out.println("static init block B");
    }
}

class C extends B {
    public static Field staticFieldC = new Field("staticFieldC");
    public Field fieldC = new Field("fieldC");
    public C() {
        System.out.println("C()");
    }
    static {
        System.out.println("static init block C");
    }
}

class Field {
    public Field(String s) {
        System.out.println(s);
    }
}