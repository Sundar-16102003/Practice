class Transaction 
{
	public static void main(String[] args) 
	{
		PaymentStatus ps[]=PaymentStatus.values();
		for(PaymentStatus pst:ps)
		{
			System.out.println(pst +":" + pst.ordinal());
		}
		
	}
}
  
