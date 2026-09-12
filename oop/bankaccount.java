import java.util.Scanner;
abstract  class bankaccount {//abstract class
    double balance;
    // ABSTRACTION:
    // We only define WHAT a bank account must do.
    // We do NOT tell here HOW deposit will work.
    //Every account must have withdraw(),
    // but the actual withdrawal rules are hidden
    // and will be implemented by child classes.
    abstract void deposit(double amount);//abstract method
    abstract void withdraw(double amount);
    // NORMAL METHOD:
    // Common behavior that all accounts can use.
    void showbalance(){
        System.out.println("Balance:" +balance);
    }
}
// HOW deposit works for SavingAccount is defined here.
// This implementation was hidden from BankAccount.
class savingaccount extends bankaccount{
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Deposit:"+amount);
        System.out.println("Deposited successfully");

    }
    // HOW withdrawal works for SavingAccount is defined here.
    void withdraw(double amount){
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("Withdraw:"+amount);
        }
        else{
            System.out.println("Insuficent balance😒");
        }
    }

}

class currentaccount extends bankaccount{
    // HOW deposit works for CurrentAccount.
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Deposit:"+amount);
        System.out.println("Deposited successfully!");
    }
    // CurrentAccount has a DIFFERENT withdrawal rule.
    // It allows an additional 10,000 overdraft.
    void withdraw(double amount){
        if(amount<=balance+10000){
            balance=balance-amount;
            System.out.println("Withdraw:"+amount);
        }
        else{
            System.out.println("Inssuficent balance!");
        }
    }
}
public void main(String[]args){
    Scanner input=new Scanner(System.in);
    currentaccount c=new currentaccount();// creating object
    savingaccount s=new savingaccount();
    System.out.println("This  records are currentaccount");
    c.deposit(20000.0);
    c.withdraw(5000.0);
    c.showbalance();
    System.out.println("this are savingaccount records");
    s.deposit(40000.00);
    s.withdraw(30000.00);
    s.showbalance();
}

