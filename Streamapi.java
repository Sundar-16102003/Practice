import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
public class Streamapi {
    public static void main(String[] args) {
        List<Integer> al=Arrays.asList(2,4,7,9,0,1,3,5);
        //Stream<Integer> s=al.stream();
        //Stream<Integer> s2=s.filter(n -> n%2==0);
       // Stream<Integer> s3=s2.map(n -> n*5);
       // s3.forEach(n ->System.out.println(n));
      Stream<Integer> l = al.stream()
       .filter(n  -> n%3==0)
       .map(n -> n+1);
       
l.forEach(n -> System.out.println(n));
    }
    
}
