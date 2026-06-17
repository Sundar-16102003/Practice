class Thread_Practice3 
{
	public static void main(String[] args) 
	{
		Thread_Practice1 tp1=new Thread_Practice1();
		Runnable r1=new Runnable()
		{
			public void run()
			{
			for(int i=1;i<=10000000;i++)
			{
				tp1.increment();
			}
			}
			
		};
		Runnable r2=new Runnable()
		{
			public void run()
			{
			for(int i=1;i<=10000000;i++)
			{
				tp1.increment();
			}
			}
		};
		LearningI t1=new LearningI(r1);
		LearningI t2=new LearningI(r2);
		t1.start();
		t2.start();
		try{
		t1.join();
		t2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(tp1.count);
	}
}

