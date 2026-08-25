import java.util.Scanner;
public class bankingsystem {
    private String bankholdername;
    private double bankbalance;
    private String accountnumber;

    //constructor
    //setter
    public  bankingsystem(String bankholdername, double bankbalance, String accountnumber) {
        this.bankholdername = bankholdername;
        this.bankbalance = bankbalance;
        this.accountnumber = accountnumber;
    }

    //getter
    public String getbankholder() {
        return bankholdername;
    }

    public double getbankbalance() {
        return bankbalance;
    }

    public String accountnumber() {
        return accountnumber;
    }

    // amount deposited
    public void deposit(double amount) {
        if (amount > 0) {
            bankbalance = (bankbalance + amount);
            System.out.println("Successfully Deposited");
            System.out.println("Deposited Amount:" + amount);
            System.out.println("Current balance:" + bankbalance);
        } else {
            System.out.println("Invalid Deposited amount");
        }
    }

    //amount withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw");
        } else if (amount > bankbalance) {
            System.out.println("Insufficient bankbalance");
            System.out.println("current bankbalance:" + bankbalance);
        } else {
            bankbalance = bankbalance - amount;
            System.out.println("withdraw successfully");
            System.out.println("Withdraw amount:" + amount);
            System.out.println("Current balance:" + bankbalance);

        }
    }

    public void showdetails() {
        System.out.println("-----------------");
        System.out.println("Account holder name:" + bankholdername);
        System.out.println("Account number:" + accountnumber);
        System.out.println("Bankbalance:" + bankbalance);
        System.out.println("------------------");

    }

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a bankholder name:");
        String name = sc.nextLine();
        System.out.println("Enter a account number:");
        String accountnumber = sc.nextLine();
        System.out.println("Enter a initial bank balance:");
        double bankbalance = sc.nextDouble();
        bankingsystem obj = new bankingsystem(name,bankbalance,accountnumber);
        int choice;
         boolean flag=true;
         while(flag) {
             System.out.println("--------WELCOMING TO BANKING SYSTEM----------");
             System.out.println("1.Deposit");
             System.out.println("2.With Draw");
             System.out.println("3.Check Balance");
             System.out.println("4.Account Details");
             System.out.println("5.Exit");
             System.out.println("Enter a choice(1-5)");
             choice = sc.nextInt();
             switch (choice) {
                 case 1:
                     System.out.println("Enter a deposit amount");
                     double depositamount = sc.nextDouble();
                     obj.deposit(depositamount);
                     break;
                 case 2:
                     System.out.println("Enter a withdraw amount");
                     double amount = sc.nextDouble();
                     obj.withdraw(amount);
                     break;
                 case 3:
                     System.out.println(" Check balance:" + obj.getbankbalance());
                     break;
                 case 4:
                     System.out.println("Account details:");
                     obj.showdetails();
                     break;
                 case 5:
                     System.out.println("Exit");
                     break;
                 default:
                     System.out.println("Invalid choice");
                     flag=false;
                     break;


             }
         }
        sc.close();
    }
}




