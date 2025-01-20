import java.util.ArrayList;

public class Inventory {

    protected ArrayList<Item> items;

    public Inventory(){
        items = new ArrayList<Item>();
    }

    public void addItem(String name, double price){
        items.add(new Item(name, price));
    }

    public Item getItemById(int index){
        return items.get(index);
    }

    public void removeItemById(int index){
        items.remove(index);
    }

    public Item getItemByName(String name){
        for(Item item : items){
            if(item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

    public int getSize(){
        return items.size();
    }

    public String toString(){
        String s = "ITEM LIST\n";
        for(Item item : items){
           s += items.indexOf(item) + ". " + item.getName() + " $" + item.getPrice() + "\n";
        }
        return s;
    }
}
