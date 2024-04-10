import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hai");
        al.add("Hello");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
