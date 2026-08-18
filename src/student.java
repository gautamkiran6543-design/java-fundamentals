public class student {
    String name;
    int age;
    String address;
    String number;
    void setdetails(){
        System.out.println("name = "+name);
        System.out.println("address = "+address);
        System.out.println("age = "+age);
        System.out.println("number = "+number);
    }
    public static void main(String[]args){
        student s1=new student();//object 1
        s1.address="urlabari";
        s1.name="kiran";
        s1.age=21;
        s1.number="9825033452";
        s1.setdetails();
        System.out.println();//this is for 0ne line space
        student s2=new student();//object 2
        s2.address="damak";
        s2.name="sandesh";
        s2.age=19;
        s2.number="9764453332";
        s2.setdetails();
        student s3=new student();
        System.out.println();
        s3.address="Itahari";
        s3.name="ram";
        s3.number="974563211";
        s3.age=19;
        s3.setdetails();

        

    }

}
