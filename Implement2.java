import java.util.Scanner;
class Implement 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the num1:");
		int num1=scan.nextInt();
		System.out.print("Enter the num2:");
		int num2=scan.nextInt();
	Addition adds=(a,b) -> a + b;
		int res=adds.add(num1,num2);
		System.out.println( num1 +  "+"  +		num2  + "=" + res);
		
		
	
	}
}

