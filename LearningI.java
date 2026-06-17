public class LearningI extends Thread {
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("sundar");
        }
    }
    public static void main(String[] args) {
LearningI i=new LearningI();
i.start();
        
    }
    
}
