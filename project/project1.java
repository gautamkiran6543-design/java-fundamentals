import java.util.Scanner;
public class project1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("-----------CALCULATOR-----------");
            System.out.println("1.ADDITION");
            System.out.println("2.SUBTRACTION");
            System.out.println("3.MULTIPLICATION");
            System.out.println("4.DIVISION");
            System.out.println("5.MODULOS");
            System.out.println("6.EXIT");
            String choose;
            System.out.println("ENTER A CHOICE(1-6):");
            choose = sc.next();
            if (choose.equals("6")) {
                running = false;
                continue;
            }
        double num1, num2;
        System.out.println("ENTER A FIRST NUMBER");
        num1 = sc.nextDouble();
        System.out.println("ENTER A SECOND NUMBER");
        num2 = sc.nextDouble();
        switch (choose) {
            case "1":
                System.out.println("ADDITION IS:" + (num1 + num2));
                break;
            case "2":
                System.out.println("SUBTRACTION IS:" + (num1 - num2));
                break;
            case "3":
                System.out.println("MULTIPLICATION IS:" + (num1 * num2));
                break;
            case "4":
                System.out.println("DIVISION IS:" + (num1 / num2));
                break;
            case "5":
                System.out.println("MODULOS IS:" + (num1 % num2));
                break;
            case "6":
                System.out.println("EXIT");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
        sc.close();


    }
}
