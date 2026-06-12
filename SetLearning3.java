
import java.util.TreeSet;
import java.util.Iterator;
class SetLearning3 
{
	public static void main(String[] args) 
	{
		//TreeSet
		//notes:
		//1.Set is the interface
		//2.Sort is the interface
		//3.Sort extends the Set interface
		//4.TreeSet is the class
		//5.TreeSet implements the Sort interface
		//6.it give output as sorted 
		//7.because of it implements the Sort interface
		//8.it is also does not allow the duplicates
		//9.it does not allow the null values
		//10.if you try to add null values in TreeSet it may throw NullPointerException
		//11.we must specify the generic ,it is not for strong common objects like below we cant do
		//{
		//TreeSet tss=new TreeSet();
		//tss.add(10);
		//tss.add(10);
		//System.out.println(tss);
	//}
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(23);
		ts.add(19);
		ts.add(0);
		ts.add(100);
		ts.add(12);
		ts.add(1);
		ts.add(17);
		ts.add(0);
		ts.add(17);
		//ts.add(null);
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=================================================================");
	TreeSet<String> lhs=new TreeSet<String>();
	lhs.add("siva");
	lhs.add("sundar");
	lhs.add("gnanam");
	lhs.add("nithiyan");
	lhs.add("sundar");
	lhs.add("nithiyan");
	//lhs.add(null);
		//lhs.add(null);
		Iterator itt=lhs.iterator();
	while(itt.hasNext())
		{
		System.out.println(itt.next());
		}
	}
}
