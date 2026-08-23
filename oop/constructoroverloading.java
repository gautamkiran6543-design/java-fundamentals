//constructor: it is used to initialize an object when object is created.this mean
// constructoroverloading obj=new constructor overloading("kiran",21); like that classname(string name,int age)
//the constructor automatically runs and stores.
//output: name=kiran
//        age=21

//constructor overloading: creating multiple constructor using different parameters

public static class constructoroverloading {
    String name;
    String address;
    int age;
    String gender;
    String level;
    String clz;
    String father;
    double height;
    String weight;
    String job,qualification,info;
    //constructor 1
    constructoroverloading() { // No-argument constructor
        name = "kiran";
        age = 21;
        address = "itahari";
        gender = "male";
        level = "Bachelor";
        clz = "GPLC";
    }
      void perinfo(){
            System.out.println(" NAME="+name);
            System.out.println("ADDRESS="+address);
            System.out.println("AGE="+age);
            System.out.println("GENDER="+gender);
            System.out.println("LEVEL="+level);
            System.out.println("CLZ="+clz);
        }
    //constructor 2 one paramater constructor
    constructoroverloading(String father) {
        this.father = father;
    }
        void fath(){
            System.out.println("FATHER NAME="+father);
        }


    //constructor 3 two parameterized constructor
    constructoroverloading(String weight,double height) {
        this.weight = weight; //using this keyword it is used to distinguish instance variables and parameters
        this.height = height;
    }
        void set(){
            System.out.println("HEIGHT="+height);
            System.out.println("WEIGHT="+weight);
        }


    //constructor 4 3-parametrized constructor
    constructoroverloading(String job,String qualificantion,String info) {
        this.job = job;
        this.qualification = qualificantion;
        this.info = info;
    }
        void display() {
            System.out.println("JOB=" + job);
            System.out.println("QUALIFICATION=" + qualification);
            System.out.println("INFO=" + info);


        }
    }

    public static void main(String[]args){
        constructoroverloading obj=new constructoroverloading();
        constructoroverloading obj1=new constructoroverloading("shankar pd gautam");
        constructoroverloading obj2=new constructoroverloading(" 60 KG",5.6);
        constructoroverloading obj3=new constructoroverloading
                ("student"," +2 passout","email: gautamkiran@gmail.com");
        obj.perinfo();
        System.out.println();
        obj1.fath();
        System.out.println();
        obj2.set();
        System.out.println();
        obj3.display();

    }

