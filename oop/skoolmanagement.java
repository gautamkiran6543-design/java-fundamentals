import java.util.ArrayList;
import java.util.Scanner;
public class skoolmanagement {
    String name;
    int id;
    String address;
    String level;

    //i used constructor inisted of method because to initalize an object that automatically call.
    skoolmanagement(int id, String name, String address, String level){
        this.id=id;
        this.name=name;
        this.address=address;
        this.level=level;

    }
}
public  void main(String[]args){
    ArrayList<skoolmanagement> student=new ArrayList<>();
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a student ID:");
    int id=input.nextInt();
    System.out.println("Enter a student Name:");
    String name=input.next();
    System.out.println("Enter a student address:");
    String address= input.next();
    System.out.println("Enter a student level:");
    String level=input.next();
    skoolmanagement s=new skoolmanagement(id,name,address,level); // here i create an object

    //add oject to arraylist
    student.add(s);
    System.out.println("Records are added successfully ✌️✌️");

}
