abstract  class bankaccount {//abstract class
    double balance;
    abstract void deposit(double amount);//abstract method
    abstract void withdraw(double amount);
    void showbalance(){
        System.out.println("Balance:" +balance);
    }
}
class savingaccount extends bankaccount{
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Deposit:"+amount);
        System.out.println("Deposited successfully");

    }
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
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Deposit:"+amount);
        System.out.println("Deposited successfully!");
    }
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

