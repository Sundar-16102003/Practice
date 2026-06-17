import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.stream.*;
class Stream_Practice 
{
	public static void main(String[] args) 
	{
		List<Integer> li=Arrays.asList(25000,40000,15000,60000,30000,8000);
		Predicate<Integer> p=salary -> salary >35000;
		Function<Integer,Integer> f= sal -> sal+sal/10;
		int   res=li.stream()
        .filter(p)
        .map(f)
        .reduce(0,(sal,bon) -> sal+bon);
        
       // System.out.println(res);

		
		
	}
}

