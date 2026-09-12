import java.util.ArrayList;
public class stud {
    String name;
    int age;
}
public static void main(String[]args){
    ArrayList<String>name=new ArrayList<>();
    ArrayList<Integer>age=new ArrayList<>();
    name.add("kiran");
    name.add("ram");
    name.add("Shyam");
    age.add(19);
    age.add(31);
    age.add(41);
    //before update
        System.out.println("before update");
        System.out.println("name:" + name);
        System.out.println("age:" + age);

    //update
   name.set(2,"dewa"); // in this portion its delet the index 1 data
   age.set(2,51);

    //delet
    name.remove(1);
    age.remove(2);

   //after update
    System.out.println("after update");
    System.out.println(name);
    System.out.println(age);






}
