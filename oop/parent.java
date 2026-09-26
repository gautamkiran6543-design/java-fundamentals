public class parent {
    String name="kiran";
    parent(){ //parent class constructor
        System.out.println("This is parent class constructor");
    }
    void show(String address, int age){
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);
    }
}
class child extends parent{
    String name="SG";
    child(){ // this is child class constructor
        System.out.println("This is child class constructor");
        super(); //call parent class constructor
    }
    void display(){
        System.out.println("Child name:" +name);
        System.out.println("Parent class name:" +super.name);
        super.show("itahari",21);
    }

}
public void main(String[]args){
    child c= new child();
    c.display();
}