import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
public class pra {
    public static void main(String[] args) {
        List<Integer> a=Arrays.asList(99,34,56,90,23,45);
        
        a.forEach(n -> System.out.println(n*2));
   
    }
}
