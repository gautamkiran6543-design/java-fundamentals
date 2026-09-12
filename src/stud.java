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
    System.out.println("name:"+name.get(0));
    System.out.println("age:"+age.get(0));
    System.out.println(name.get(1));
    System.out.println(age.get(1));
    System.out.println(name.get(2));
    System.out.println(age.get(2));


}
