public class encapsulationexamples {
    private String name;
    private int age;
    void display(String name, int age){
        this.name=name;
        this.age=age;
    }
    void setdetails(){
        System.out.println("name="+name);
        System.out.println("age="+age);
    }

        public static void main(String[] args) {
            encapsulationexamples obj= new encapsulationexamples();
            obj.display("kiran",21);
            obj.setdetails();
        }
    }

