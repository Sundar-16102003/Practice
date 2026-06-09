
class Practicing 
{
	public static void main(String[] args) 
	{
		PaymentStatus [] ps=PaymentStatus.values();
		
		for(int i=0;i<ps.length;i++)
		{
		switch(ps[i])
		{
			case SUCCESS:
			{
				System.out.println("Done:"+ps); 
				break;
			}
			case FAILED:
			{
				System.out.println("something went wrong" + ps);
				break;
			}
			case PENDING:
			{
			System.out.println("It takes some time" + ps);
			}
		}
		}
		PaymentStatus pss=PaymentStatus.SUCCESS;
		System.out.println(pss.getClass());
		System.out.println(pss.name());
			System.out.println(pss.name());
		
		//PaymentStatus st=new PaymentStatus();
	
	}
}
