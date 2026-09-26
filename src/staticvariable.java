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
