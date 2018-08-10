package lecture8;

public abstract class Clothing implements Cleanable, Comparable<Clothing> {
    private String name;
    private int price;

    public Clothing(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract void wash();

    @Override
    public int compareTo(Clothing o) {
        return getPrice() - o.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
