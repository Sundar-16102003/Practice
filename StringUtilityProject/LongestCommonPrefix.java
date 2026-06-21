package StringUtilityProject;
class LongestCommonPrefix 
{
	public static void main(String[] args) 
	{
		String words[]={"abc","abc","axc"};
		StringBuilder longestCommonprefix=new StringBuilder("");
		String word=words[0];
		int lengthOfTheFirstWord=word.length();
		for(int i=0;i<lengthOfTheFirstWord;i++)
		{
			int count=0;
			char c=word.charAt(i);
			for(int j=1;j<words.length;j++)
			{
				if(i<words[j].length())
				{
					char ch=words[j].charAt(i);
					if(c==ch)
					{
					count++;
						if(count==words.length-1)
						{
							 longestCommonprefix.append(c);
						}
					}
				}
			}
			if(count!=words.length-1)
			{
				break;
			}
		}
		System.out.println(longestCommonprefix);
	}	
}
