import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
class Stream_Practice 
{
	public static void main(String[] args) 
	{
		List<Integer> li=Arrays.asList(25000,40000,15000,60000,30000,8000);
		int   res=li.stream()
        .filter(salary -> salary>30000)
        .map(salary ->salary + salary/10)
        .reduce(0,(sal,bon) -> sal+bon);
        
        System.out.println(res);

		
		
	}
}

