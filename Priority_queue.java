import java.util.PriorityQueue;
class Priority_queue 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer>q=new PriorityQueue<Integer>();
		q.add(27);
		q.add(12);
		q.add(76);
		q.add(1);
		q.add(100);
		q.add(3);
		//System.out.println(q.peek());
		//q.poll();
		//System.out.println(q.peek());
		//q.poll();
		//System.out.println(q.peek());
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
		
		
		
	}
}

