import java.util.Scanner;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        System.out.println("How many student do you want to store");
        int n=input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a name");
            String name = input.next();
            names.add(name);
            System.out.println("Enter a age");
            int ages = input.nextInt();
            age.add(ages);
        }
        System.out.println("stored detail successfully:");
        for(int i=0;i<names.size();i++){
            System.out.println("Name="+names.get(i)+
            "\nAge="+age.get(i));
        }
    }
}