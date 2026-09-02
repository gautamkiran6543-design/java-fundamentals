//Interface:It is a contract or rule book. it tells class what method have ,but doenot tell it how to perform.
// we use it becaude: to achieve abstraction.
//(It hides the implementation and shows only what is required.)
//to create common rules:eg payment system needs to pay method from differnt class.
//to support polymorphism:
//to implement multiple interface: eg class khalti implements esewa,payment.
//Rules:create the interface, implement it, create the object and use the implements refrence.
// extends vs implements
// class + class
//    → extends
//
//class + interface
//    → implements
//
//interface + interface
//    → extends
public class interfaceeg {
   interface payment{
        public void pay();


        }
    static class esewa implements payment{
       public void pay(){
            System.out.println("payment through esewa");
        }
    }
    static class khalti implements payment{
        public void pay(){
            System.out.println("payment through khalti");
        }
    }
    static class bank implements payment{
       public void pay(){
           System.out.println("payment through bank");
       }
    }
    public void main(String[]args){
       payment ob; // implements reference
       ob=new esewa(); // this is creating the object
       ob.pay(); //call method
       ob=new khalti();
       ob.pay();
       ob=new bank();
       ob.pay();


    }
}
