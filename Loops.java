import java.util.Random;
import java.util.LinkedList;
class Loops
{
	public static void main(String[] args) 
	{
		String name[]={"ramesh","suresh","anbu","guna"};
		Random rand=new Random();
		System.out.println("====================Enhanced For loop===================================");
		for(String print:name)
		{
			System.out.println(print + ":" +  rand.nextLong(6666666666l,9999999999l));
		}
		System.out.println("====================For loop===================================");
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i] +":" +rand.nextLong(6666666666l,9999999999l));
		}
		LinkedList ll=new LinkedList();
		ll.add(7708230612l);
		ll.add("siva");
		ll.add(10.0);
		
		for(Object ob:ll)
		{
			System.out.println(ob);
		}
		
		
	}
}

