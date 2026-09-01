public class abstraction { //outer class
    abstract class animal{
        void details(String dog, String cat) {
            System.out.println("dog=" + dog);
            System.out.println("cat=" + cat);
        }
            abstract void sound();

        }
    class animal1 extends animal{
        @Override
        void sound(){
            System.out.println("they create different sound");

        }
    }
    public  void main(String[]args){
        animal1 ob=new animal1();
        ob.details("it barks","it doesnot bark it meow");
        ob.sound();
    }
}
