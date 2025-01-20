import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjFile_Inventory extends Inventory{

    public void saveFile(String path){
        try(
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(path));
        ){
            writer.writeObject(this.items);
        }catch (Exception e){
            System.err.println(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFile(String path){
        try(
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(path))
        ){
            ArrayList<Item> newInventory = (ArrayList<Item>) reader.readObject();
            this.items.addAll(newInventory);
        }catch (Exception e){
            System.err.println(e.toString());
        }
    }

}
