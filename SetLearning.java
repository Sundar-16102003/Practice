import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class SetLearning 
{
	public static void main(String[] args) 
	{
		//you can also create like this
	Set<String> ss=new HashSet<String>();
	HashSet<String> hs=new HashSet<String>();
	hs.add("siva");
	hs.add("sundar");
	hs.add("gnanam");
	hs.add("nithiyan");
	hs.add("sundar");
	hs.add("nithiyan");
	hs.add(null);
		hs.add(null);
		//HashSet
		//Notes:
		//Set is the interface 
		//HashSet is the class
		//HashSet  class implements the Set interface
	//duplicates are not allowed here
	//insertion order is not preserved
	//null value allowed
	Iterator it=hs.iterator();
	while(it.hasNext())
		{
		System.out.println(it.next());
		}
		System.out.println("=============================================================================");
		HashSet<Integer> hss=new HashSet<Integer>();
	hss.add(1);
	hss.add(23);
	hss.add(70);
	hss.add(76);
	hss.add(100);
	hss.add(100);
		hss.add(null);
	Iterator itt=hss.iterator();
	while(itt.hasNext())
		{
		System.out.println(itt.next());
		}
		
	
	}
}
