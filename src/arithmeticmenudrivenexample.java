import java.util.Scanner;
public class arithmeticmenudrivenexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        int num1, num2;
        System.out.println("enter a first number");
        System.out.println("enter a second number");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("------------MENU---------");
        System.out.println("1.Addition");
        System.out.println("2.subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        System.out.println("5.Modulos");
        System.out.println("6.Exit");
        System.out.println("Enter a choice((1-6)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition="+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction="+(num1-num2));
                break;
            case 3:// this is conditional statement check whether number is even it is exucted
                // if number is odd it doesnot executed
                if ((num1%num2)==0) {
                    System.out.println("Division=" + (num1 / num2));
                }
                    else{
                        System.out.println("The number is not divisible it is odd number");
                }
                break;
            case 4:
                System.out.println("Multiplication="+(num1*num2));
                break;
            case 5:
                System.out.println("Modulos="+(num1%num2));
                break;
            case 6:
                System.out.println("Program Exit");
                break;


            default:
                System.out.println("invalid choice");




        }
        sc.close();
    }
}
