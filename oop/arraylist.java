import java.util.Scanner;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        num.add(11);
        num.add(15);
        ArrayList<String> name = new ArrayList<>();
        name.add("ram");
        name.add("kiran");
        name.add("Kg");
        for(int i=0;i<name.size();i++){
            System.out.println(name.get(i));
            System.out.println(num.get(i));

        }

    }
}
