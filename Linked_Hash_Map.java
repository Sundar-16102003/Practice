import java.util.LinkedHashMap;
class Linked_Hash_Map 
{
	public static void main(String[] args) 
	{
		//notes
		//LinkedHashMap is the class
		//it extends HashMap
		// same as HashMap
		// key difference - it insertion order is preserved
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(01,"sundar");
		lhm.put(02,"nithiyan");
		lhm.put(03,"rajesh");
		lhm.put(04,"ashok");
		lhm.put(05,"vijay");
		lhm.put(06,"jaga");
		System.out.println(lhm);
		System.out.println(lhm.keySet());
		System.out.println(lhm.get(06));
	lhm.remove(06);
	for(Integer key:lhm.keySet())
		{
		System.out.println(key + ":"  + lhm.get(key));
		}
			
	}
}
