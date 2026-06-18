class Customer 
{
	public static void main(String[] args) 
	{
		Movie_Theatre mt=new Movie_Theatre();
		Runnable run=() -> mt.bookSeat();
		Thread t1=new Thread(run,"customer-1");
		Thread t2=new Thread(run,"customer-2");
		Thread t3=new Thread(run,"customer-3");
		Thread t4=new Thread(run,"customer-4");
		Thread t5=new Thread(run,"customer-5");
		Thread t6=new Thread(run,"customer-6");
		Thread t7=new Thread(run,"customer-7");
		try{
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();
		}
		catch(InterruptedException e){}
		

	}
}

