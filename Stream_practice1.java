import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
class Stream_practice1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("sundar");
		al.add("arun");
		al.add("john");
		al.add("ajay");
		al.add("david");
		Stream<String>s1=al.stream()
			.filter(name -> name.startsWith("a"));
		s1.forEach(prin ->System.out.println(prin));
		al.forEach(n -> System.out.println(n));
	}
}
