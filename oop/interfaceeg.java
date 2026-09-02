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
       payment ob;
       ob=new esewa();
       ob.pay();
       ob=new khalti();
       ob.pay();
       ob=new bank();
       ob.pay();


    }
}
