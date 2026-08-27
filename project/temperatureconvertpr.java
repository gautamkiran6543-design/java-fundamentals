import java.util.Scanner;
public class temperatureconvertpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("----------TEMPERATURE CONVERTOR----------");
            System.out.println("1.celcius to fahrenheit");
            System.out.println("2.fahrenheit to celcius");
            System.out.println("3.celcius to kelvin");
            System.out.println("4.kelvin to celcius");
            System.out.println("5.kelvin to fahrenheit");
            System.out.println("6.fahrenheit to kelvin");
            System.out.println("7.Exit");
            System.out.println("enter a choice(1-7)");
            double c, f, k;
            char choice = sc.next().charAt(0);
            if (choice == '7') {
                flag = false;
                break;
            }
            switch (choice) {
                case '1':
                    System.out.println("Enter a celcius");
                    c = sc.nextDouble();
                    f = (c * 9 / 5) + 32;
                    System.out.println("FAHRENHEIT=" + f);
                    break;
                case '2':
                    System.out.println("Enter a fahrenheit");
                    f = sc.nextDouble();
                    c = (f - 32) * 5 / 9;
                    System.out.println("CELCIUS=" + c);
                    break;
                case '3':
                    System.out.println("Enter a celcius");
                    c = sc.nextDouble();
                    k = c + 273.15;
                    System.out.println("KELVIN=" + k);
                    break;
                case '4':
                    System.out.println("Enter a kelvin");
                    k = sc.nextDouble();
                    c = k - 273.15;
                    System.out.println("CELCIUS=" + c);
                    break;
                case '5':
                    System.out.println("Enter a kelvin");
                    k = sc.nextDouble();
                    f = (k - 273.15) * 9 / 5 + 32;
                    System.out.println("FAHRENHEIT=" + f);
                    break;
                case '6':
                    System.out.println("Enter a fahrenheit");
                    f = sc.nextDouble();
                    k = (f - 32) * 5 / 9 + 273.15;
                    System.out.println("KELVIN=" + k);
                    break;
                case '7':
                    System.out.println("Exit:");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
            sc.close();
    }
}
