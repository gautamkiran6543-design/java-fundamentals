public class nankaccount {
    private String accountnumber;
    private int balance;
    nankaccount(String accountnumber, int balance){ //constructor is the special member of class that is used to
        //inatalize the object that is automatically called.
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    //setter method

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    //getter method
    public String getaccountnumber(){ // remember while using getter with return type doesnot use void
        return accountnumber;
    }

        public int getbalance () {
            return balance;
        }
    public static void main(String[]args){
        nankaccount n=new nankaccount("1233455",45000);
        System.out.println("Account number:"+n.accountnumber);
        System.out.println("Balance:"+n.balance);
        //updating balance
        n.setBalance(50000);
        System.out.println("updating balance:"+n.getbalance());

    }
}
