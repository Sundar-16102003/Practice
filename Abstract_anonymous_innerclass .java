abstract class Abstract_anonymous_innerclass 
{
	abstract void baloon();
}
class demo 
{
	public static void main (String [] args)
	{
		Abstract_anonymous_innerclass aai=new Abstract_anonymous_innerclass ()
		{
			void baloon(){
				System.out.println("fill the air");
			}
		};
		aai.baloon();
	}
			
}

