import java.util.Scanner;

public class BankDetails {
    private String NID;
    private String AccountType;
    private String Name;
    private String Password;
    private Long Balance;
    Scanner input = new Scanner(System.in);

    public void OpenAccount()
    {
        System.out.println("Enter NID Number:");
        NID=input.nextLine();
        System.out.println("Enter Account Type:");
        AccountType=input.nextLine();
        System.out.println("Enter Customers Name:");
        Name=input.nextLine();
        System.out.println("Enter Balance:");
        Balance=input.nextLong();
    }
    public void ShowAccount()
    {
        System.out.println("Account Holder Name:"+Name);
        System.out.println("NID Number:"+NID);
        System.out.println("Account Type:"+AccountType);
        System.out.println("Total Balance:"+Balance);
    }
    public boolean Search(String nid)
    {
        if(NID.equals(nid))
        {
            ShowAccount();
            return true;
        }
        return false;
    }

    public void Deposit()
    {
        System.out.println("Enter The Amount:");
        long a=input.nextLong();
        Balance=Balance+a;
        System.out.println("Total Balance After Deposit:"+Balance);
    }

    public void Withdraw()
    {
        System.out.println("Enter The Amount:");
        Long a=input.nextLong();
        if(a>Balance)
        {
            System.out.println("Total Amount is less than Withdrawal Amount...Please Deposit Balance");
            System.out.println("Total Amount:"+Balance);
        }
        else
        {
            Balance=Balance-a;
            System.out.println("Correcnt Amount IS:"+Balance);
        }
    }


}
