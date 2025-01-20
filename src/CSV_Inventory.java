import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSV_Inventory extends Inventory{

    public void saveFile(String path){
        try(
            PrintWriter writer = new PrintWriter(new FileOutputStream(path))
        ){
            for(Item item : this.items){
                writer.println(item.getName() + "," + item.getPrice());
            }

        }catch (Exception e){
            System.err.println(e.toString());
        }
    }

    public void loadFile(String path){
        try(
            Scanner reader = new Scanner(new FileInputStream(path))
        ) {
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] parts = line.split(",");
                this.items.add(new Item(parts[0], Double.parseDouble(parts[1])));
            }

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

}
