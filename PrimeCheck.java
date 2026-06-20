
class PrimeCheck
{
	public static void main(String[] args) 
	{
		int num=1;
		int count=0;
		if(num!=1 && num!=0)
		{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				count++;
			
		}
		if(count==0 && num!=0)
			System.out.println("Prime Number");
		else
			System.out.println(" not a Prime number");
		
		}
		else
			System.out.println(" not a Prime number");
	}
}

