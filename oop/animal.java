public class animal {
    String name;
    int weight;

    void feature(String name, int weight) {
        System.out.println("name:" + name);
        System.out.println("weight:" + weight);
    }
}

    public class animal1 extends animal {


        void feature(String name, int weight) {
            System.out.println("name:" + name);
            System.out.println("weight:" + weight);
            System.out.println("it can bark");
        }
    }

        public class animal2 extends animal {


            void feature(String name, int weight) {
                System.out.println("name:" + name);
                System.out.println("weight:" + weight);
                System.out.println("it can meow");
            }
        }

        public class animal3 extends animal {

            void feature(String name, int weight) {
                System.out.println("name:" + name);
                System.out.println("weight:" + weight);
                System.out.println("it can roar");
            }
        }

    public  void main(String[] args) {
        animal o1;
        o1 = new animal1();
        o1.feature("Dog",30);
        o1=new animal2();
        o1.feature("cat",9);
        o1=new animal3();
        o1.feature("tiger",200);

    }


