//Abstraction: it means hiding unnecessary details and show only the important part
public class abstraction { //outer class
    abstract class animal{
        abstract void sound();// inner class
        void details(String dog, String cat) {
            System.out.println("dog=" + dog);
            System.out.println("cat=" + cat);
        }

        }
    class animal1 extends animal{
        @Override
        void sound(){
            System.out.println("they create different sound");

        }
    }
    public  void main(String[]args){
        animal ob=new animal1(); //parent class refrence child class object
        ob.details("it barks","it doesnot bark it meow");
        ob.sound();
    }
}
