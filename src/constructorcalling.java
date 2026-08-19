public class constructorcalling {
    int age;
    String name;
    String address;

    //constructor 1
    constructorcalling() {
        this(19, "kiran", "itahari"); // one constructor can call another constructor
        // inside same class (using this keyword)
    }

    //constructor 2
    constructorcalling(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    void detail() {
        System.out.println("age:" + age);
        System.out.println("name:" + name);
        System.out.println("address:" + address);
    }

    public static void main(String[] args) {
        constructorcalling o = new constructorcalling();
        System.out.println("Student 1 detail:");
        o.detail();
        System.out.println(" ");
        System.out.println("Student 2 detail:");
        constructorcalling o1 = new constructorcalling(20, "KG", "urlabari");
        o1.detail();
        System.out.println(" ");
        System.out.println("Student 3 detail:");
        constructorcalling obj = new constructorcalling(19, "sandesh", "ktm");
        System.out.println();
        obj.detail();
        System.out.println(" ");
        constructorcalling o3=new constructorcalling(21,"Saujanya","ith");
        o3.detail();
    }
}

