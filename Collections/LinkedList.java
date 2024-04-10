import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListExample {
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Sree");
        ll.add("Vij");
        ll.add("shiv");
        ll.add("Har");
        Iterator<String> itr = ll.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
