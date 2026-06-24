import java.util.*;
class Dq 
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
		dq.addFirst(10);
		dq.addFirst(11);
		dq.addFirst(12);
		dq.addLast(13);
		dq.addLast(14);
	dq.pollFirst();//12
	dq.pollFirst();//11
	System.out.println(dq);//10,13,14
	System.out.println(dq.peekFirst());//10
	System.out.println(dq.peekLast());//14
	dq.pollLast();//14
	System.out.println(dq);//10,13
		
	}
}

