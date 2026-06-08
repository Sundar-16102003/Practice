class Anagram 
{
	public static void main(String[] args) 
	{
		String str1="Listen";
		String str2="silent";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char ch[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		char[] getOutput=sorting(ch);
		char [] getOutput2=sorting(ch2);
		String str3=getString(getOutput);
		String str4=getString(getOutput2);
		if(str1.length()==str2.length())
		{
			if(str3.equals(str4))
			{
			System.out.println("Anagram");
			}
			else
			{
			System.out.println("not a anagram");
			}
		}
		else
		{
			System.out.println("not a anagram");
		}
		
		
		
		
	}
		
		 public static char[] sorting(char [] ch)
		{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
			return ch;
		}
		public static String getString(char cc[])
	{ 
			String str="";
			for(int i=0;i<cc.length;i++)
			{
				str=str+cc[i];
				
			}
			return str;
	}
			
		
	
		
	
}

