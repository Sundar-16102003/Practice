import java.util.InputMismatchException;
import java.util.Scanner;
class NumberUtility {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[]args)  {
    
        try{
        int option;
        
        do{
            System.out.println("\n1.Prime number\n2.Palindrome\n3.DuckNumber\n4.Factorial\n5.Reverse \n6.Exit");
            System.out.println("Enter the option");
             option=scan.nextInt();
switch(option)
{

    case 1:
        {
            
        
        
            
                System.out.println("Enter the num");
              int num=0;
                
                     num=scan.nextInt();
                     
                
                
                   int count=0;
                    if(num>0){
                    
                        for(int i=2;i<=num/2;i++)
                        {
                        
                        
                            if(num%i==0)
                            {
                            
                                count++;
                            }
                            
                        }
                    
                        if(count==0){
                            if(num==0||num==1){
                                System.out.println("The entered number is neither 0 or 1 so both are not became prime number");
                            }
                            else{
                            System.out.println("It is prime number");
                            }
                        }
                        else{
                            System.out.println("It is not Prime number");
                        }
                    
                        

                    }
                    else
                    {
                    
                        System.out.println("It is not Prime number");
                    }
                
                
                
                
}
        
                    
                    
        
        break;
        case 2:
            {
                System.out.println("Enter the num");
                int num=scan.nextInt();
                if(num>0){
                    int temp=num;
                    int rev=0;
                    while(temp>0){
                        int digits=temp%10;
                        rev=rev*10+digits;
                        temp/=10;
                    }
                    if(num==rev){
                        System.out.println("It is Palindrome");
                    }
                    else{
                        System.out.println("It is not palindrome");
                    }
                }
                else{
                    System.out.println("It is not Palindrome");
                }
            }
            break;
            case 3:
                {
                   System.out.println("Enter the num");
                    int num=scan.nextInt();
                    int temp=num;
                    int original_num=num;
                    int count=0;
                    int divisor=1;
                    int zero_count=0;
                    while(temp>0)
                    {
                        int digits=temp%10;
                        count++;
                        if(digits==0){
                            zero_count++;
                        }
                        temp/=10;
                    }
                        for(int i=0;i<count-1;i++){
                            divisor=divisor*10;
                        }
                        int first_num=num/divisor;
                        if(first_num!=0&&zero_count>=1)
                        {
                            System.out.println("It is duck Number");
                        }
                        else{
                            System.out.println("It is not duck number");
                        }
                     
                }
                break;
                case 4:
                    {
                        System.out.println("Enter the num");
                        int num=scan.nextInt();
                        int fact=1;
                        for(int i=num;i>=1;i--)
                        {
                            fact=fact*i;
                        }
                        System.out.println(fact);
                    }
                    break;
                    case 5:
                        {
                            System.out.println("Enter the num");
                            int num=scan.nextInt();
                            int temp=num;
                            int rev=0;
                            while(num>0)
                            {
                                int digits=num%10;
                                rev=rev*10+digits;
                                num/=10;
                            }
                            System.out.println("OriginalNumber:"+ temp +"Reversed Num:"+rev);
                        }
                        break;
            
        case 6:
            {
            
                System.out.println("Thank you Visit Again");
            }
}


        
                
        
          }  while(option!=6);
        }
        catch(InputMismatchException e)
                {
                    System.out.println(e.getMessage());
                }
                // catch(ArithmeticException e)
                // {
                //     System.out.println("invalid");
                // }
}
}
