import java.util.Scanner;

public class Register {
    private CSV_Inventory inv;
    private Scanner userInput;

    public Register() {
        inv = new CSV_Inventory();
        userInput = new Scanner(System.in);
    }

    public String getCSVFileNameFromUser(){
        String name = "";
        while(name.length() <= 5 || !name.endsWith(".csv")) {
            System.out.print("Enter valid CSV file name: ");
            name = this.userInput.nextLine();
        }
        return name;
    }

    public void saveInventory(){
        String path = getCSVFileNameFromUser();
        inv.saveFile(path);
        System.out.println("Saved Inventory in " + path);
    }

    public void loadInventory(){
        String path = getCSVFileNameFromUser();
        inv.loadFile(path);
        System.out.println("Loaded Inventory from " + path);
    }

    public String getItemNameFromUser() {
        String name = "";
        while(name.length() < 1) {
            System.out.print("Enter item name (at least 1 char): ");
            name = this.userInput.nextLine();
        }
        return name;
    }

    public double getPriceFromUser() {
        double price = -1;
        while(price <= -1) {
            System.out.print("Enter item price (>= 0): $");
            price = Double.parseDouble(this.userInput.nextLine());
        }
        return price;
    }

    public int getItemIDFromUser() {
        int itemId = -1;
        while(itemId <= -1) {
            System.out.print("Enter valid item ID: ");
            itemId = Integer.parseInt(this.userInput.nextLine());
        }
        return itemId;
    }

    public int getQuantityFromUser(Item item) {
        int quantity = -1;
        while(quantity <= -1) {
            System.out.print("Enter quantity (>= 0) of "+ item.getName() +" $"+ item.getPrice() +": ");
            quantity = Integer.parseInt(this.userInput.nextLine());
        }
        return quantity;
    }

    public void showInventory() {
        System.out.println(this.inv);
    }

    public void addToInventory() {
        String n = this.getItemNameFromUser();
        double p = this.getPriceFromUser();
        this.inv.addItem(n, p);
    }

    public void removeFromInventory() {
        showInventory();

        int userItemId = -1;
        while(userItemId == -1) {
            try {
                userItemId = getItemIDFromUser();
                this.inv.items.remove(userItemId);
            } catch (IndexOutOfBoundsException iob){
                userItemId = -1;
            }
        }
    }

    public void processCustomer() {
        showInventory();
        Order newOrder = new Order();
        String done = "n";

        while(done.equals("n")){
            int userItemId = getItemIDFromUser();
            Item userSelItem = this.inv.getItemById(userItemId);
            int userQuantity = getQuantityFromUser(userSelItem);

            newOrder.addItem(userSelItem, userQuantity);
            System.out.println(newOrder.toString());

            System.out.print("Done adding items (y or n)? ");
            if(this.userInput.nextLine().equalsIgnoreCase("y")){
                done = "y";
            }
        }
    }

    public void start() {
        String c = "";
        while (!c.equals("Q")) {
            System.out.println("\nAvailable Commands");
            System.out.println("(S)how inventory.");
            System.out.println("(A)dd to inventory.");
            System.out.println("(R)emove from inventory.");
            System.out.println("sa(V)e inventory to file.");
            System.out.println("(L)oad inventory from file.");
            System.out.println("(P)rocess Customer.");
            System.out.println("(Q)uit.");
            System.out.print("Enter Command: ");
            c = userInput.nextLine();

            if (c.equals("S")) {
                this.showInventory();
            } else if (c.equals("A")) {
                this.addToInventory();
            } else if (c.equals("R")) {
                this.removeFromInventory();
            } else if (c.equals("V")) {
                this.saveInventory();
            } else if (c.equals("L")) {
                this.loadInventory();
            } else if (c.equals("P")) {
                this.processCustomer();
            }
        }
    }
}