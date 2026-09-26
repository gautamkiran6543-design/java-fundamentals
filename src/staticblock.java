public class staticblock {

    String name;
    static String college = "Lincoln cllz";
    int id;
    static String level = "bachelor";

    staticblock(String name, int id) { // here i create a constructor
        this.name = name;
        this.id = id;
    }

    void show() {
        System.out.println("name:" + name);
        System.out.println("id:" + id);

    }

    static void dislay() {
        System.out.println("level:" + level);
        System.out.println("college:" + college);

    }

    static {
        System.out.println("all the details are student of lincoln college"); //at first block run and then
        // after calling value run
    }
}

            public void main(String[] args) {
                staticblock s = new staticblock("kiran", 202); //constructor calling
                s.show(); //calling normal method
                staticblock.dislay(); //class name .static method directly call method not needed object
                System.out.println();
                staticblock s1 = new staticblock("Saugat", 303);
                s1.show();
                staticblock.dislay();
            }

