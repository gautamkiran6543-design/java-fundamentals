import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int choice = 0;
        while (flag) {

            System.out.println("------------MENU---------");
            System.out.println("1.Addition");
            System.out.println("2.subtraction");
            System.out.println("3.Division");
            System.out.println("4.Multiplication");
            System.out.println("5.Modulos");
            System.out.println("6.Exit");
            System.out.println("Enter a choice((1-6)");
            choice = input.nextInt();
            if (choice == 6) { //choice.equals(6) is only used for string so
                flag = false;
                continue;
            }


            System.out.println("enter a first number");
            double a = input.nextDouble();
            System.out.println("enter a second number");
            double b = input.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Addition:" + (a + b));
                    break;
                case 2:
                    System.out.println("SUBTRACTION IS:" + (a - b));
                    break;
                case 3:
                    System.out.println("MULTIPLICATION IS:" + (a * b));
                    break;
                case 4:
                    System.out.println("DIVISION IS:" + (a / b));
                    break;
                case 5:
                    System.out.println("MODULOS IS:" + (a % b));
                    break;
                case 6:
                default:
                    System.out.println("Invalid choice");

            }

        }
    }
}