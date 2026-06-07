import java.util.Scanner;
class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the word:");
		String word=scan.nextLine();
		String newWord=removeDuplicates(word);
		System.out.println("After removing Duplicates:" +newWord);
	
	}
	public static  String removeDuplicates(String word)
	{
		String emt="";
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(emt.indexOf(ch)==-1)
			{
				emt=emt+ch;
			}
		}
		return emt;
		
		
	}
}

