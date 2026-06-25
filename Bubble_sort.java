import java.util.Arrays;
public class Bubble_sort {
    public static void main(String[] args) {
        int steps=0;
        int arr[]={4,9,0,18,7,1,8,22};
        System.out.println("before sorting:");
                System.out.println(Arrays.toString(arr));
                System.out.println();
        for(int i=0;i<arr.length;i++)
        {
              
            for(int j=i+1;j<arr.length;j++)
            {
                steps++;
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
  System.out.println(Arrays.toString(arr));
                    
                }
               
            }
                          
             
        }
        
        System.out.println(steps);
     
        }
    
}
