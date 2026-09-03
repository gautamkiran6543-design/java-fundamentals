import java.util.Scanner;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer>age= new ArrayList<>();
        System.out.println("How many student do you want to store");
        input.nextInt();
        System.out.println("Enter a name");
        String name=input.next();
        names.add(name);
        System.out.println("Enter a age");
        int ages=input.nextInt();
        age.add(ages);
    }
}