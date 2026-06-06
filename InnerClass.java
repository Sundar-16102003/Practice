	 class A
{
	String car="BMW";
	
	 class B
	{
		 void characteristics()
		{
			System.out.println("SportsCar:"+ car);
		}
		
	}
	public static void main(String[] args) 
	{
		A inc=new A();
		System.out.println(inc.car);
		A.B inc2=inc.new B();
        inc2.characteristics();
		//InnerClass2.characteristics();
	//InnerClass.InnerClass2 inc2=inc.new InnerClass2();
	
	}
	
}
