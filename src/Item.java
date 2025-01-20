import java.io.Serializable;

public class Item implements Serializable {
    private String name;
    private double price;

    public Item(String n, double p){
        this.name = n;
        this.price = p;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " $" + price;
    }
}
