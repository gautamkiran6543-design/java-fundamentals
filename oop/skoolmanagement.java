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
    System.out.println("--------------------------------------------------------");
    System.out.println("====How many students records do you want to store?====");
    int n= input.nextInt();

    for(int i=0;i<n;i++) {
        System.out.println("Enter a student ID:");
        int id = input.nextInt();
        System.out.println("Enter a student Name:");
        String name = input.next();
        System.out.println("Enter a student address:");
        String address = input.next();
        System.out.println("Enter a student level:");
        String level = input.next();
        skoolmanagement s = new skoolmanagement(id, name, address, level); // here i create an object

        //add oject to arraylist
        student.add(s);
        System.out.println("Records are added successfully ✌️✌️");
        System.out.println("-----------------------------------");
    }

    //this part is for storing data
    for(int i=0;i<student.size();i++){
        skoolmanagement s1=student.get(i); // Get the student object from the ArrayList at index i
        System.out.println("ID:"+s1.id);
        System.out.println("Name:"+s1.name);
        System.out.println("Address:"+s1.address);
        System.out.println("Level:"+s1.level);
    }
    System.out.println("---------------------------------");

    //Update
    System.out.println("-------Enter a student id to update Data?-------");
    int searchId=input.nextInt();
    for (int i=0;i< student.size();i++){
        skoolmanagement s1=student.get(i);
        if(s1.id==searchId){ // Check whether the current student's ID matches the ID we entered
            //new records are generate
            System.out.println("Enter a new name:");
            String name=input.next();
            System.out.println("Enter a new address:");
            String address=input.next();
            System.out.println("Enter a new level:");
            String level=input.next();
            System.out.println("---------successfully new records are Updated---------");
            break; //stop the loop because we found the id

        }
        else{
            System.out.println("--------------Invalid ID----------------");
        }
    }

    //Delet Records
    System.out.println("-------Enter a student id to Delet from records----------");
    searchId = input.nextInt();
    for(int i=0;i<student.size();i++){
        skoolmanagement s1=student.get(i);
        if(s1.id==searchId){
            student.remove(i); //remove the student record from arraylist
            System.out.println("-----Successfully deleted the records------");
            break;


        }
        else{
            System.out.println("-------Invalid ID-------");
        }
    }

}
