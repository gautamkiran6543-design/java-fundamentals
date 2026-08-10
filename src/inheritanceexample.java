public class inheritanceexample {
    public class animal {
        void feature() {
            System.out.println("includes all feature");
        }
    }

    public class dog extends animal {
        void run() {
            System.out.println("it can bark");
        }
    }

    public class cat extends dog {
        void meow() {
            System.out.println("it can meow");
        }
    }

    public static void main(String[] args) {
        inheritanceexample obj=new inheritanceexample();
        cat c= obj.new cat();
        c.meow();
        c.run();
        c.feature();
    }
}



