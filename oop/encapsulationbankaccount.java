//Encapsulation: it means wrapping data(variables) and method inside the class and controlling direct access to the data.
// data hiding+control access

public class encapsulationbankaccount {
    // this part are data hiding because i used private so it cannot be accessed outside the class.
    // this is settermethod as well
    private String bankholder;
    private double bankbalance;
    private double accountnumber;

    //this are control access public= that allow private variables read/changed in a control way
    public void setdetails(String bankholder, double bankbalance, double accountnumber){
        this.bankholder=bankholder;
        this.bankbalance=bankbalance;
        this.accountnumber=accountnumber;
    }
    //this is getter method
    public String getbankholder(){
        //System.out.println(bankholder); // i can directly call inside method as well
        return bankholder;
    }
    public double getaccountnumber(){
        //System.out.println(accountnumber);
        return accountnumber;

    }
    public double getbankbalance(){
        //System.out.println(bankbalance);
        return bankbalance;

    }
    public static void main(String[]args){
        encapsulationbankaccount obj=new encapsulationbankaccount();
        obj.setdetails("Saujanya Gautam",12000,275556464);//calling setter
        System.out.println( obj.getbankholder()); // call getter
        System.out.println(obj.getaccountnumber()); //call
        System.out.println(obj.getbankbalance()); //call

    }

}
//        BankAccount
//             |
//     ┌───────┴────────┐
//     |                |
// Private Data      Public Methods
//     |                |
// balance          deposit()
// accountNumber    withdraw()
// accountHolder    getBalance()
