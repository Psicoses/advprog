import java.util.ArrayList;

public class Order {

    ArrayList<LineItem> lineItems;

    public Order(){
        lineItems = new ArrayList<LineItem>();
    }

    public void addItem(Item item, int quantity){
        lineItems.add(new LineItem(item, quantity));
    }

    public double getTotal(){
        double totalSum = 0;

        for(LineItem lItem : lineItems){
            totalSum += lItem.getTotal();
        }

        return totalSum;
    }

    public String toString(){
        String strOut = "";

        for(LineItem lItem : lineItems){
            strOut += lItem.getQuantity() + " x " + lItem.getItem().getName() + " $" + lItem.getItem().getPrice() + ": $" + lItem.getTotal() + "\n";
        }
        strOut += "Order Total: $"+ getTotal() +"\n";

        return strOut;
    }


}
