
import java.util.Scanner;
public class Arithmeticexample {
    public static void main(String[]args) {

        int a, b;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a  number");
         a = sc.nextInt();
        System.out.print("enter a second number");
        b=sc.nextInt();
        System.out.print("enter operator(+, -,*,/)");
         op = sc.next().charAt(0);
        switch(op){
            case'+':
                System.out.println("addition="+(a+b));
                break;
            case'-':
                System.out.println("subtraction="+(a-b));
                break;
            case'*':
                System.out.println("multiplikcation="+(a*b));
                break;
            case'/':
                System.out.println("division="+(a/b));
                break;
            default:
                System.out.println("invalid choice");


        }
        sc.close();
    }


}
