import java.util.LinkedHashSet;
 import java.util.Iterator;
 class SetLearning2 
 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lh= new LinkedHashSet<Integer>();
		lh.add(55);
		lh.add(18);
		lh.add(3);
		lh.add(55);
		lh.add(100);
		lh.add(99);
		lh.add(null);
		//LinkedHashSet
		//notes:
		//1.insertion order is preserved
		//2.duplicates not allowed
		//3.Set is the interface
		//4.HashSet implements the Set interface
		//5.LinkedHashSet extends HashSet
		//6.LinkedHashSet is  class
		//7.null values also allowed
		//difference of HashSet and LinkedHashSet
		//*HashSet Does not maintain insertion order
		//*But LinkedHashSet maintain insertion order
		Iterator it=lh.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=================================================================");
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
	lhs.add("siva");
	lhs.add("sundar");
	lhs.add("gnanam");
	lhs.add("nithiyan");
	lhs.add("sundar");
	lhs.add("nithiyan");
	lhs.add(null);
		lhs.add(null);
		Iterator itt=lhs.iterator();
	while(itt.hasNext())
		{
		System.out.println(itt.next());
		}
	}
}

