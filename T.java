
public   class  T extends Thread {
        public void run()
{
for(int i=0;i<100;i++)
{
    System.out.println("sundar");
    try{
    Thread.sleep(2000);
    }
    catch(InterruptedException e)
    {
    e.printStackTrace();
    }
}
    }
    
}


    
