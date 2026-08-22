
//using static in method and final variables in inheritance
//if we use static method then we can call directly using class name . method name without of creating object
public class inheritanceexample {
    static final int age=15;
    static final String name="Dog";
    public class animal {

       static void feature() {
            System.out.println("name="+name);
            System.out.println("age="+age);
           System.out.println(" there are many dog in nepal");

        }
    }
static final int weight=30;
    static final String speed="57 km";
    public class dog extends animal {
        static void run() {
            System.out.println("weight="+weight);
            System.out.println("speed="+speed);
            System.out.println("it can bark");
        }
    }
static final String animal="cat";
    static final int ages=2;
    public class cat extends dog {
        static void meow() {
            System.out.println("Animal name="+animal);
            System.out.println("Age="+ages);
            System.out.println("it can meow");
        }
    }
    public static void main(String[] args) { // Here i havent creating any object name i directly
        // call it using class name and method name (cat.run) in inheritance
        cat.meow();
        System.out.println(" ");
        cat.feature();
        cat.run();

    }
}



