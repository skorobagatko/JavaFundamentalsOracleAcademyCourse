package lecture7.inheritence;

import java.util.Objects;

public class Shirt extends Clothing {

    private int size;
    public String color;

    public Shirt(String name, int price, int size) {
        super(name, price);
        setSize(size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shirt shirt = (Shirt) o;
        return size == shirt.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void wash() {
        super.wash();
        size--;
    }
}
