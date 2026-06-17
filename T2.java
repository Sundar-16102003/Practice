public class T2 extends Thread{
    public void run()
    {
for(int i=0;i<100;i++)
{
    System.out.println("Nithiyan");
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
