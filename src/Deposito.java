import java.util.ArrayList;


public class Deposito<queCosa> {

    private final ArrayList<queCosa> storage;


    public Deposito() {
        this.storage = new ArrayList<>();
    }

    public void add(queCosa item) {
        this.storage.add(item);
    }

    public queCosa get() {
        if(!storage.isEmpty() && storage.size()!=0){
            return storage.remove(0);
        }
        else {
            return null;
        }
    }
}
