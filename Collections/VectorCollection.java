import java.util.Iterator;
import java.util.Vector;

public class VectorCollection {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Sree");
        v.add("Vije");
        v.add("Shiva");
        v.add("Hari");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
