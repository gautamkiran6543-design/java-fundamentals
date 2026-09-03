import java.util.Scanner;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        ArrayList<String> names= new ArrayList<>();
        String name;
        System.out.println("Enter a name");
        names.add("ram");
        names.add("kiran");
        names.add("gautam");
        System.out.println(names);
    }
}
