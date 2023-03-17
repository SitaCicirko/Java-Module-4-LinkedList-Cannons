import java.util.LinkedList;
import java.util.List;

class Canon {
    private boolean loaded = true;
     public void fire() {
         if (!loaded) {
             System.out.println("Unloaded. Loadinng...");
             loaded = true;
         }
         else {
             System.out.println("Loaded. Firing!");
             loaded = false;
         }
     }
}
public class Program {
    public static void main(String[] args) {
        LinkedList<Canon> c = new LinkedList<>();
        c.add(new Canon());
        c.add(new Canon());
        c.add(new Canon());
        c.add(new Canon());
        c.add(new Canon());
        for (Canon canon :c){
            canon.fire();
        }
    }
}