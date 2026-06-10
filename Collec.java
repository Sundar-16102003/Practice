import java.util.Collections;
import java.util.ArrayList;
class Collec
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> all=new ArrayList<Integer>();
		all.add(12);
		all.add(20);
		all.add(55);
		all.add(99);
		all.add(1);
		all.add(45);
		all.add(1000);
		all.add(7);
		System.out.println( "Maximum Number:" +Collections.max(all));
		System.out.println( "Minimum Number:" +Collections.min(all));
		System.out.println("Before sort:" +all);
		Collections.sort(all);
		System.out.println( "After sort:" + all);
		Collections.reverse(all);
		System.out.println( "After reversing:" + all);
		System.out.println(Collections.replaceAll(all,1,0));
		System.out.println(all);
		Collections.shuffle(all);
		System.out.println(all);
		Collections.sort(all);
		System.out.println(Collections.binarySearch(all,7));
		Collections.fill(all,0);
		System.out.println(all);
		System.out.println(Collections.frequency(all,0));
		
		
		
		
		
}
}

