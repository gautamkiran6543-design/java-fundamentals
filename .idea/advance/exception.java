public class exception {
    public static void main(String[]args){
    int a=10;
    int b=0;
    try {
        int result = a / b;
        System.out.println(result);
    }
    catch(ArithmeticException e){
        System.out.println("it executes the program");
        }

}
}
