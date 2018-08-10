package lecture8;

public class Jeans extends Clothing {
    public Jeans(String name, int price) {
        super(name, price);
    }

    @Override
    public void wash() {
        System.out.println("Jeans is clean");
        setPrice(getPrice() - 1);
    }

    @Override
    public String howToClean() {
        return "20 degree";
    }

    @Override
    public String toString() {
        return "Jeans{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
