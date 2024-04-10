import java.util.Iterator;
import java.util.Stack;
public class StackCollection {
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Sree");
        stack.push("Vije");
        stack.push("Shiv");
        stack.push("Hari");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
