import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How Many Number of Customers Do you want to input:");
        int n=input.nextInt();
        BankDetails c[]=new BankDetails[n];
        for(int i=0;i<c.length;i++)
        {
            c[i]=new BankDetails();
            c[i].OpenAccount();
        }
        int choice;
        do{
            System.out.println("------Banking system 2023------");
            System.out.println("1. Display All Account");
            System.out.println("2. Searching Account");
            System.out.println("3. Deposit The Amount");
            System.out.println("4. Withdraw The Amount");
            System.out.println("5. Exit");
            choice=input.nextInt();
            switch(choice)
            {
                case 1:
                    for(int i=0;i<c.length;i++)
                    {
                        c[i].ShowAccount();
                    }
                    break;
                case 2:
                    System.out.println("Enter The NID Number :");
                    String nid=input.nextLine();
                    boolean found = false;
                    for(int i=0;i<c.length;i++)
                    {
                        found=c[i].Search(nid);
                        if(found)
                        {
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Incorrect NID Number");
                    }
                    break;
                case 3:
                    System.out.println("Enter The NID Number:");
                    nid=input.nextLine();
                    found = false;
                    for(int i=0;i<c.length;i++)
                    {
                        found=c[i].Search(nid);
                        if(found)
                        {
                            c[i].Deposit();
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Incorrect NID Number...");
                    }
                    break;
                case 4:
                    System.out.println("Enter The NID Number:");
                    nid=input.nextLine();
                    found = false;
                    for(int i=0;i<c.length;i++)
                    {
                        found = c[i].Search(nid);
                        if(found)
                        {
                            c[i].Withdraw();
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Incorrect NID Number...Try Again");
                    }
                    break;
                case 5:
                    System.out.println("See You Soon...");
                    break;
            }
        }while(choice!=6);

    }
}