import java.util.TreeMap;
class Tree_Map 
{
	public static void main(String[] args) 
	{
		//notes 
		//TreeMap is the class
		//TreeMap is implements sortMap
		// sortMap is the interface
		//sort map is sub interface of Map
		//it give outputs as  sorted order
		TreeMap<String,Long> tm=new TreeMap<>();
		tm.put("sundar",7708230612l);
		tm.put("nithiyan",9442877079l);
		tm.put("rajesh",9150421403l);
		tm.put("jaga",9444771398l);
		for(String name:tm.keySet())
		{
			System.out.println(name + ":" + tm.get(name));
		}
		System.out.println("========================================================================================");
		System.out.println(tm.keySet());
		System.out.println(tm);
		System.out.println(tm.remove("jaga"));
		System.out.println(tm);
		System.out.println(tm.get("Sundar"));//null
	}
	
}

