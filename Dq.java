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
	dq.pollFirst();
	dq.pollFirst();
	System.out.println(dq);
	System.out.println(dq.peekFirst());
	System.out.println(dq.peekLast());
	dq.pollLast();
	System.out.println(dq);
		
	}
}

