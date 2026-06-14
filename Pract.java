import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Pract {
    public static void main(String[] args) {
        
    
    Comparator<Integer> c=new Comparator<Integer>()
    {
    
        public int compare(Integer c,Integer d)
        {
if(c%10>d%10)
{
    return 1;

}
else{
    return -1;
}
        }
    };
    ArrayList<Integer> li=new ArrayList<>();
li.add(54);
li.add(79);
li.add(13);
li.add(60);
li.add(95);
li.add(31);

Collections.sort(li,c);
System.out.println(li);
}
}
Comparable