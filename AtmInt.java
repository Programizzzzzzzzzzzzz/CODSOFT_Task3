import java.util.Scanner;
public class AtmInt
{
    public static void main(String args[])
    {
        double amount;
        Scanner sc=new Scanner(System.in);
        UserAccount obj=new UserAccount(1000);
        
        System.out.println("|| Welcome To ATM ||");
       
           while (true)
            {
                System.out.println();
                System.out.println("Please select from the Following:\n");
                System.out.println("1: Withdraw");
                System.out.println("2: Deposit");
                System.out.println("3: CheckBalance");
                System.out.println("4: Exit");
                System.out.println();
                System.out.println("Enter your choice:");
                int choice=sc.nextInt();

                switch(choice)
                {
                    case 1:
                        System.out.println("Enter the amount you want to withdraw:");
                        amount=sc.nextDouble();
                        obj.withdraw(amount);
                        break;

                    case 2:
                        System.out.println("Enter the amount you want to deposit");
                        amount=sc.nextDouble();
                        obj.deposit(amount);
                        
                        break;

                    case 3:
                        obj.getBalance();
                        break;

                    case 4:
                        System.exit(0);
                        
                        break;

                    default:
                        System.out.println("Invalid choice, Please try again");
                }
            }
    }
}


 class UserAccount 
{
     double balance;
    public UserAccount(double balance)
    {
        
        balance=this.balance;
    }

    public void withdraw(double amount)
    {
        
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("Amount withdhrawn is: Rs."+amount+ "Available balance is:Rs."+balance);
        }
        else{
            System.out.println("Insufficient Balance!");
        }
        
    }

    public void getBalance()
    {
        System.out.println("your balance is: Rs. "+balance);
    }

    public void  deposit(double amount)
    {
        if (amount>0)
        {
            balance+=amount;
            System.out.println("Amount Deposited: Rs."+amount+"Available Balance: Rs."+balance);
        }
        
    }
}