	 class InnerClass
{
	static String car="BMW";
	
	 class InnerClass2
	{
		 void characteristics()
		{
			System.out.println("SportsCar:"+ car);
		}
		
	}
	public static void main(String[] args) 
	{
		InnerClass inc=new InnerClass();
		System.out.println(inc.car);
		InnerClass.InnerClass2 inc2=inc.new InnerClass2();
        inc2.characteristics();
		//InnerClass2.characteristics();
	//InnerClass.InnerClass2 inc2=inc.new InnerClass2();
	
	}
	
}
