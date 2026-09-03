import java.util.Scanner;
public class schoolmanagmentsystem {
    class student {
        public String name;
        private int id;
        private int age;
        public String address;
        public String level;

        public void student(String name, int id, int age, String address, String level) { //  constructor overloading
            this.name = name;
            this.id = id;
            this.address = address;
            this.age = age;
            this.level = level;
        }
    }
    class teacher{
        public void setdetails(String name,String salary, int age,String address, String level, int id ){ //method
            System.out.println("Name=" + name);
            System.out.println("Age=" + age);
            System.out.println("Address=" + address);
            System.out.println("Level=" + level);
            System.out.println("ID=" + id);
            System.out.println("Salary="+salary);

        }
    }
    static void details(String name, int id, String address, String level){
        System.out.println("Name="+name);
        System.out.println("Address="+address);
        System.out.println("ID="+id);
        System.out.println("Level="+level);

    }
    class course{
        static void display(String subject, int id, double fee,String coursename){
            System.out.println("Course Name="+coursename);
            System.out.println("Sunject="+subject);
            System.out.println("ID="+id);
            System.out.println("Fee="+fee);
        }
    }


    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println();
        System.out.println("===SCHOOL MANAGEMENT SYSTEM===");
        System.out.println();
        System.out.println("1. Add student");
        System.out.println("2.View Students");
        System.out.println("3.Search student");
        System.out.println("4.Update student");
        System.out.println("5.Delet student");
        System.out.println("6.Add Teacher");
        System.out.println("7.View teacher");
        System.out.println("8.Exit");
        System.out.println("Enter a choice(1-8)");
        int choice=input.nextInt();
        switch(choice){
            case 1:

        }
    }
}
