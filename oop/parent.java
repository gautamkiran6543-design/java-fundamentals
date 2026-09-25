public class parent {
    String name="kiran";
}
class child extends parent{
    String name="SG";
    void display(){
        System.out.println(name);
        System.out.println(super.name);
    }
}
public void main(String[]args){
    child c= new child();
    System.out.println(c.name);
    c.display();
}