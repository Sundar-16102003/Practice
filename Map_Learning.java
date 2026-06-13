import java.util.HashMap;
import java.util.Map;
class Map_Learning 
{
	public static void main(String[] args) 
	{
		//notes
		//Map is the interface 
		//HashMap implements Map 
		//HashMap is the class
		//it does not maintain the insertion order
		//value may duplicates
		//key not allow duplicates
		//null value accepted
		Map<String,Integer> hmm=new HashMap<>();
	HashMap<String ,Integer> hm=new HashMap<>();
	hm.put("sundar",345);
	hm.put("nithiyan",123);
	hm.put("rajesh",234);
	hm.put("ashok",3456);
	hm.put("vijay",145);
	hm.put("ajith",1245);
	hm.put("yuvi",3675);
	hm.put("jaga",234);
	//System.out.println(hm);
	System.out.println(hm.keySet());//it gives key
	System.out.println(hm.values());// it gives value
	System.out.println(hm.get("sundar"));// we pass key then get values of the particular key

	for( String key:hm.keySet())
		{
		

		System.out.println(key + ":" + hm.get(key));
		}
		System.out.println(hm.containsKey("sundar"));//check key present or not
		System.out.println(hm.remove("jaga"));//remove the key
		System.out.println(hm.size());// size of the hashmap
	
}
}
