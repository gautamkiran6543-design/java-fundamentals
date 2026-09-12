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
    System.out.println("-----------------------------------");


    //this part is for storing data
    for(int i=0;i<student.size();i++){
        skoolmanagement s1=student.get(i); // Get the student object from the ArrayList at index i
        System.out.println("ID:"+s1.id);
        System.out.println("Name:"+s1.name);
        System.out.println("Address:"+s1.address);
        System.out.println("Level:"+s1.level);
    }
    System.out.println("---------------------------------");

}
