package ExpenseProject;

import java.util.Scanner;

public class projmain {
    private static String id;
    public static void main(String[] args) throws Exception{
        

        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("************Welcome to the Friends Splitting System");
        System.out.println("1.login");
        System.out.println("2.Signup");
        System.out.println("3.Exit");
        System.out.println("******Enter you choice******");
        int ch=sc.nextInt();
        if(ch!=3)
        {
        dataoperations obj1=new dataoperations();
        switch (ch)
        {
            case 1:
                //obj1.loginFriend();
                projmain.id=obj1.loginFriend();
                if(projmain.id!=null)
                {
                    while(true)
                    {   System.out.println("******************");             
                System.out.println("1.Enter a distribution details");
                System.out.println("2.Pay bill amount");
                System.out.println("3.Display total to be paid");
                System.out.println("4.Display my transactions");
                System.out.println("5.Display all transactions");
                System.out.println("6.logout");
                System.out.print("******Enter you choice******");
                int ch1=sc.nextInt();
                if(ch1==6)
                {break;}
                if(ch1>6){
                    System.out.println("Enter valid choice");
                }
                switch (ch1) {
                    case 1:
                        obj1.enterDistribution(projmain.id);
                        break;
                    case 2:
                       obj1.payBill(projmain.id);break;
                    case 3:
                         obj1.displaytotal(projmain.id);break;
                    case 4:
                        obj1.dispalymytransactions(projmain.id);break;                        
                    case 5:
                          obj1.dispalyalltransactions(); break;
                    default:
                        break;
                               }             
                 }

                }
                else
                {
                    System.out.println("Login failed. Try one more time");
                }
                break;
            case 2:
                obj1.signupFriend();
                break;
            default:
                System.out.println("Enter correct choice");
                break;
        }
    }
    else
    {   
        System.out.println("************Friends Splitting System is Sucessfully Shutdown");
        break;
    }
        
    }        
    
    }
}
