import java.sql.SQLOutput;
import java.util.Scanner;
public class doexample {
    public static void main(String []args) {
        Scanner sc=new Scanner (System.in);
        int j=3;
        int k=4;
        System.out.println("Enter a (a,b,c)");
        char result= sc.next().charAt(0);
            switch(result){
                case 'a':
                    System.out.println("a.Addition="+(j+k));
                    break;
                case 'b':
                    System.out.println("b.subtraction="+(j-k));
                    break;
                case 'c':
                    System.out.println("c.Multliplication="+(j*k));
                    break;
                default:
                    System.out.println("Invalid choice");

        }
        sc.close();
        }
    }


