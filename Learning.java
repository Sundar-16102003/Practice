import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Learning {
    public static void main(String[] args) {
        
    
    ArrayList<Integer> al=new ArrayList<Integer>();
    al.add(13);
    al.add(21);
    al.add(15);
    al.add(2);
    al.add(1);
    al.add(5);
    al.add(12);
    al.add(19);
    al.add(78);
    al.add(45);
    LinkedList<Integer> li=new LinkedList<Integer>();
    li.addAll(al);
    li.add(12);
    
   // System.out.println(al);
 boolean b=al.containsAll(li);
   System.out.println(b);
   // System.out.println(al);
    System.out.println(li);
   // ListIterator it=al.listIterator(3);
   // System.out.println(it.hasPrevious());
    //System.out.println(it.previous());
    }
    
}
