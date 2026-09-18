public class exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try { //Contains risky code
            int result = a / b;
            System.out.println(result);
        }
        catch (ArithmeticException e) { //handles exception
            System.out.println("it executes the program");
        }
        finally { //always runs
            System.out.println("it runs the exception always");
        }
        if(0>10){
            throw new ArithmeticException("mistake");
        }
    }
}
