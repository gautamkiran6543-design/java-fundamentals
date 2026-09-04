import java.util.ArrayList;
import java.util.Scanner;
public class arraylisteg {
    static void deetails(String name,int age){
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }
    public void main(String[]args){
        Scanner input= new Scanner(System.in);
        ArrayList<String> name=new ArrayList<>();
        ArrayList<Integer> age=new ArrayList<>();
        System.out.println("Enter a name");
        String names =input.next();
        System.out.println("Enter a age");
        int ages=input.nextInt();
        name.add(names);
        age.add(ages);
        System.out.println("Store data successfully");
        //always use index while storing data
        System.out.println(name.get(0));
        System.out.println(age.get(0));
        deetails("ram",34);

    }


}
