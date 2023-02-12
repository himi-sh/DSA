import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListvsVector {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);

        Enumeration e = v.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
