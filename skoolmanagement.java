import java.util.ArrayList;
import java.util.Scanner;
public class skoolmanagement {
    String name;
    int id;
    String address;
    String level;

    //Student
    //i used constructor inisted of method because to initalize an object that automatically call.
    skoolmanagement(int id, String name, String address, String level) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.level = level;

    }
}

//Teacher
class teacher{
    int id;
    String name;
    String address;
    String subject;
    teacher(int id, String name, String address, String subject){
        this.id=id;
        this.name=name;
        this.address=address;
        this.subject=subject;

    }
}
public  void main(String[]args) {
    ArrayList<skoolmanagement> student = new ArrayList<>();
    ArrayList<teacher> teacher = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    boolean flag = true;
    boolean studentsflag=true;
    boolean teachersflag=true;
    while (flag) {
        System.out.println("🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶");
        System.out.println("===SCHOOL MANAGEMENT SYSTEM===");
        System.out.println("   1.MANAGE STUDENT");
        System.out.println("   2.MANAGE TEACHER");
        System.out.println("   3.EXIT");
        System.out.println("   Enter a Choice (1-3)");
        System.out.println("🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶");
        int choice = input.nextInt();
        switch (choice) {

            //student
            case 1:
                while (studentsflag) {
                    System.out.println("🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶");
                    System.out.println("===Welcome to Student MANAGEMENT SYSTEM===");
                    System.out.println("   1. Add student");
                    System.out.println("   2.View Students");
                    System.out.println("   3.Update student");
                    System.out.println("   4.Delet student");
                    System.out.println("   5.Exit");
                    System.out.println("   Enter a choice(1-5)");
                    System.out.println("🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶");
                    int studentchoice = input.nextInt();
                    switch (studentchoice) {


                        case 1: //Add records
                            System.out.println("--------------------------------------------------------");
                            System.out.println("====How many students records do you want to store?====");
                            int n = input.nextInt();

                            for (int i = 0; i < n; i++) {
                                System.out.println("Enter a student ID:");
                                int id = input.nextInt();
                                System.out.println("Enter a student Name:");
                                String name = input.next();
                                System.out.println("Enter a student address:");
                                String address = input.next();
                                System.out.println("Enter a student level:");
                                String level = input.next();
                                skoolmanagement s = new skoolmanagement(id, name, address, level); // here i create an object

                                //Add oject to arraylist
                                student.add(s);
                                System.out.println("Records are added successfully ✌️✌️");
                                System.out.println("-----------------------------------");
                            }
                            break;

                        case 2:
                            // This part is for storing data
                            for (int i = 0; i < student.size(); i++) {
                                skoolmanagement s1 = student.get(i); // Get the student object from the ArrayList at index i
                                System.out.println("🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁");
                                System.out.println("ID:" + s1.id);
                                System.out.println("Name:" + s1.name);
                                System.out.println("Address:" + s1.address);
                                System.out.println("Level:" + s1.level);
                                System.out.println("🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁");
                                System.out.println();
                            }
                            System.out.println("-------------------------------------");
                            break;

                        case 3:
                            // Update
                            System.out.println("-------Enter a student id to update Data?-------");
                            int searchId = input.nextInt();
                            for (int i = 0; i < student.size(); i++) {
                                skoolmanagement s1 = student.get(i);
                                if (s1.id == searchId) { // Check whether the current student's ID matches the ID we entered
                                    //new records are generate
                                    System.out.println("Enter a new name:");
                                    String name = input.next();
                                    System.out.println("Enter a new address:");
                                    String address = input.next();
                                    System.out.println("Enter a new level:");
                                    String level = input.next();

                                    //Store new record
                                    //i dont need to store like student.add(s1) because
                                    s1.name = name;
                                    s1.address = address;
                                    s1.level = level;

                                    System.out.println("---------successfully new records are Updated---------");
                                    break; //stop the loop because we found the id

                                } else {
                                    System.out.println("--------------Invalid ID----------------");
                                }
                            }
                            break;

                        case 4:
                            //Delet Records
                            System.out.println("-------Enter a student id to Delet from records----------");
                            searchId = input.nextInt();
                            for (int i = 0; i < student.size(); i++) {
                                skoolmanagement s1 = student.get(i);
                                if (s1.id == searchId) {
                                    student.remove(i); //remove the student record from arraylist
                                    System.out.println("-----Successfully deleted the records------");
                                    break;


                                } else {
                                    System.out.println("-------Invalid ID-------");
                                }
                            }
                            break;

                        case 5:
                        default:
                            System.out.println("Exit");
                            studentsflag = false;
                            break;
                    }
                }
                break;

                // Teacher
            case 2:
                while (teachersflag) {
                    System.out.println("🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶");
                    System.out.println("===Welcome to Teacher Management System===");
                    System.out.println("   1. Add Teachers");
                    System.out.println("   2.View Teachers");
                    System.out.println("   3.Update Teachers");
                    System.out.println("   4.Delet Teachers");
                    System.out.println("   5.Exit");
                    System.out.println("   Enter a choice(1-5)");
                    System.out.println("🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶🪶");
                    int teacherchoice = input.nextInt();
                    switch (teacherchoice) {

                        // add
                        case 1:
                            System.out.println("--------------------------------------------------------");
                            System.out.println("====How many Teachers records do you want to store?====");
                            int n = input.nextInt();

                            for (int i = 0; i < n; i++) {
                                System.out.println("Enter a Teacher ID:");
                                int id = input.nextInt();
                                System.out.println("Enter a Teacher Name:");
                                String name = input.next();
                                System.out.println("Enter a Teacher address:");
                                String address = input.next();
                                System.out.println("Enter a Teacher subject:");
                                String subject = input.next();
                                teacher t = new teacher(id, name, address, subject); // here i create an object

                                //add oject to arraylist
                                teacher.add(t);
                                System.out.println("Records are added successfully ✌️✌️");
                                System.out.println("-----------------------------------");
                            }
                            break;

                        // view
                        case 2:
                            for (int i = 0; i < teacher.size();
                                 i++) {
                                teacher t=teacher.get(i);
                                System.out.println("🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁");
                                System.out.println("ID:"+t.id);
                                System.out.println("Name:"+t.name);
                                System.out.println("Address:"+t.address);
                                System.out.println("Subject:"+t.subject);
                                System.out.println("🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁🍁");
                                System.out.println();


                            }
                            System.out.println("-------------------------------------");
                            break;

                            //update
                        case 3:
                            System.out.println("--------------Enter a Teacher id to update-------------");
                            int searchid=input.nextInt();
                            for(int i=0;i<teacher.size();i++){
                                teacher t=teacher.get(i);
                                if(t.id==searchid){
                                    System.out.println("Enter a new name");
                                    String name=input.next();
                                    System.out.println("Enter a new address");
                                    String address=input.next();
                                    System.out.println("Enter a new subject name");
                                    String subject=input.next();

                                    //store data
                                    t.name=name;
                                    t.address=address;
                                    t.subject=subject;
                                    break;

                                }
                                else{
                                    System.out.println("------Invalid ID-------");
                                }

                            }
                            break;

                            //Delet
                        case 4:
                            System.out.println("----Enter a ID of teacher to Delet---");
                             searchid=input.nextInt();
                             for(int i=0; i<teacher.size();i++){
                                 teacher t=teacher.get(i);
                                 if(t.id==searchid){
                                     teacher.remove(i);
                                     System.out.println("Successfully Deleted the records");
                                     break;
                                 }
                                 else{
                                     System.out.println("------Invalid ID------");
                                 }


                             }
                             break;
                        case 5:
                            System.out.println("Exit");
                            teachersflag=false;
                            break;
                    }
                }
                break;

            case 3:
                System.out.println("Exit");
                flag=false;
                break;

        }
    }
}
