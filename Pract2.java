import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Pract2 {
    public static void main(String[] args) {
        Comparator<String> cs=new Comparator<String>() {
            
                @Override
                public int compare(String a,String b) {
                
if(a.length()>b.length())
{
    return 1;
}
else if(a.length()<b.length())
    {
    return -1;
}
else{
    return 0;
}
                }
        };

            
        
        ArrayList<String> al=new ArrayList<String>();
        al.add("sundar");
        al.add("ashok");
        al.add("rajesh");
        al.add("nithiyan");
        al.add("ajith");
        al.add("jaga");
        al.add("yuvaraj");
        Collections.sort(al);
       System.out.println("Sorting based on alphabetic order");
       System.out.println(al);
        System.out.println("Sorting based on length of the String");
        Collections.sort(al,cs);
        System.out.println(al);
    }
}
        
    

    

