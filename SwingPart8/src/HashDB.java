import java.util.HashMap;

public class HashDB implements Database{

    private static final HashMap<String,String> database = new HashMap<>();

    @Override
    public String GetData(String id) {
        if(database.containsKey(id)){
            return database.get(id);
        } else {
            return "Not Present";
        }
    }

    @Override
    public void StoreData(String id,String name) {
        database.put(id,name);
    }
}
