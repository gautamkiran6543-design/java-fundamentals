public class throwsandthrow {
       static void divide() throws ArithmeticException {
            int result =10/0;
            System.out.println(result);

        }
    public static void main(String[]args){
            //throwsandthrow o=new throwsandthrow();
            try{
                divide(); //here i use static method not needed to create an object
            }
            catch (ArithmeticException e){
                System.out.println("not divisible by 0");

        }
    }


}
