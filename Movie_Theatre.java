class Movie_Theatre 
{
	int available_seats=5;
	
	public  synchronized void bookSeat()
	{
		int seat=1;
		if(seat<=available_seats)
		{
			
			available_seats-=seat;
			System.out.println( Thread.currentThread().getName() +"seat booked successfully");
		}
		else
		{
			System.out.println("HouseFull");
		}
	}
	
}

