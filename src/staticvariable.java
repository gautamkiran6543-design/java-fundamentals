//satic variable means that it belongs to the class not to each individual object.
//if i declare static variable then it will same value for every creating object.
public class staticvariable {
    static String name="kiran";
    int marks;

    void display(int marks) {
        System.out.println("name:" + name);
        System.out.println("Marks:" + marks);
    }
    public static void main(String[]args){
        staticvariable a=new staticvariable();
      a.display(456);
        a.display(45);
    }
}
