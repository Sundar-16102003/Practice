class Panagram 
{
	public static void main(String[] args) 
	{
		String name="abcdefghijklmnopqrstuvwxyz{[";
		name=name.toLowerCase();
		String r_name="";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(r_name.indexOf(ch)==-1&& (ch!=32 && (ch>=97 &&ch<=122)))
			{
				r_name=r_name+ch;
			}
	}
	
if(r_name.length()==26)
		{
	System.out.println("it is panagram");
	}
	else
		{
		System.out.println("it is not panagram");
		System.out.println(r_name);
		}
	}
}

