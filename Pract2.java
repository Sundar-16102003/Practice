import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Pract2 {
    public static void main(String[] args) {
        //Lamda expression  for anonymous class
        //Lamda expression work for functional interface only
        //functional interface only have one abstarct method
        //Comparator is the functional interface 

        Comparator<String> cs=(a, b) ->  a.length()>b.length()?1:-1; 
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
        
    

    

