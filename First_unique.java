import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
class First_unique
{
	public static void main(String[] args) 
	{
		int freq=0;
		String name="aabbc";
		ArrayList<Character> lii=new ArrayList<Character>();
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			lii.add(ch);
		}
		Iterator it=lii.iterator();
		while(it.hasNext())
		{
			Character chh=(Character)it.next();
		 freq=Collections.frequency(lii,chh);
			if(freq==1)
			{
				
				System.out.println(chh);
				break;
			}
				
		}
		
		
	}
}
