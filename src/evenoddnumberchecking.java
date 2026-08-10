//import java.util.Scanner;
// public class evenoddnumberchecking {
   // public static void main(String[] args) {
   //     Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter any user choice number");
      //  int number=sc.nextInt();
       // boolean flag=true;
        //if (number%2==0){
      //      System.out.println("The number is even"+flag);
        //}
    //    else{
      //      System.out.println("The number is odd");
      //  }
      //  sc.close();
   // }
//}

//using boolean flag correctly
import java.util.Scanner;
public class evenoddnumberchecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number:");
        int num = sc.nextInt();
        boolean flag;
        if (num % 2 == 0) {
            flag = true;
            System.out.println("The number is Even");


        } else if (num % 2 != 0) {
            flag = false;
            System.out.println("The number is odd");
        }
sc.close();
    }
}


