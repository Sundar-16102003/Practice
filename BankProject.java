import java.util.Scanner;
import java.util.Random;
class Bank {
    static Scanner scan=new Scanner(System.in);
    private String user_name;
    private long contact_no;
    private float user_balance;
    private int user_pin;
    private long Account_no;
    Bank(String user_name,long contact_no,float user_balance,int user_pin)
    {
        this.user_name=user_name;
        this.contact_no=contact_no;
        this.user_balance=user_balance;
        this.user_pin=user_pin;
    }
    public void generateAccount_no()
    {
Random rand=new Random();
long account_no=rand.nextLong(111111111l,999999999l);
System.out.println(account_no);
    }
    public String getName()
    {
        return user_name;
    }
    public void setName(String name)
    {
        System.out.println("old name:");
        System.out.println(user_name);
        this.user_name=name;
        System.out.println(user_name);

        System.out.println("name updated successfully");
        
    }
    public void setContact(long cont)
    {
        System.out.println("old_contact:");
        System.out.println(contact_no);
        this.contact_no=cont;
        System.out.println(contact_no);
        System.out.println("contact updated successfully");
    }
    public void setPin(int pinn)
    {
        System.out.println("old pin:");
        System.out.println(user_pin);
        this.user_pin=pinn;
        System.out.println(user_pin);
        System.out.println("pin updated successfully");
    }
    public void getAccount_number()
    {
        System.out.println(Account_no);
    }
    public boolean pinVerification(int Entered_pin)
    {
        if(user_pin==Entered_pin)
        {
return true;
        }
        else{
            return false;
        }
    }
    public void Withdrawn(int Entered_amount,int pin)
    {
if(user_pin==pin) 
{


        
        if(user_balance>=Entered_amount)
        {
            System.out.println("please collect your cash");
        }
        else{
            System.out.println("In sufficient amount");
        }
    }
    else{
        System.out.println("Incorrect pin");
    }
    }

    
    public void checkBalance(long contact,int pin)
    {
        if(contact==contact_no)
        {
            if(pin==user_pin)
            {
                System.out.println(user_balance);
            }
            else{
                System.out.println("pin invalid");
            }

        }
        else{
            System.out.println("phone number does not match or pin incorrect");
        }

    }
    public void  deposit(int amount)
    {
        this.user_balance+=amount;
        System.out.println("Your amount successfully deposited");
        
    }
    public void Update_details(long contact)
    {
        if(contact_no==contact) 
        {
        Random rand=new Random();
        int otp=rand.nextInt(1111,9999);
        System.out.println(otp);
        System.out.println("Enter the otp");
    int entered_o=scan.nextInt();
        if(entered_o==otp)
        {
            System.out.println("1.Name\n2.Contact\n3.Pin");
int update_option=scan.nextInt();
switch(update_option)
{
    case 1:
        {


    
        System.out.println("Enter the name to be update");
        scan.nextLine();
        String Entered_name=scan.nextLine();
        setName(Entered_name);
        }
        break;
        case 2:
            {
                System.out.println("Enter the contact to be update");
        scan.nextLine();
        long cont=scan.nextLong();
        setContact(cont);
            }
            break;
            case 3:
                {
                    System.out.println("Enter the pin you want to update");
                    int pin_change=scan.nextInt();
                    setPin(pin_change);

                }
}
        
        }
        else{
            System.out.println("otp wrong");
        }

        }
        else{
            System.out.println("Contact number does not match");
        }
    }
    


}
