public class LineItem {

    private Item item;
    private int quantity;

    public LineItem(Item item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal(){
        return quantity * item.getPrice();
    }

    @Override
    public String toString() {
        return quantity + " x " + item.getName() + " $" + item.getPrice() + ": $" + getTotal();
    }
}
