  class acessmodifiers {
    public String name;
    private String job;
    protected String personalinformation;
     void insert(String name, String job, String personalinformation){
        System.out.println("name="+name);
        System.out.println("job="+job);
        System.out.println("personalinformation="+personalinformation);
    }
    public String job(){
         return job;
    }
}
class modifiers extends acessmodifiers{
    public String clz;
    private String level;
    protected int age;
     void setdetails(String clz, String level, int age){
        this.clz=clz;
        this.level=level;
        this.age=age;
    }
    void display(){
        System.out.println("clz="+clz);
        System.out.println("level="+level);
        System.out.println("age="+age);

    }

}
public class Main{

 public static void main(String[] args) {
     modifiers obj1 = new modifiers();
     System.out.println("====personalinformation of kiran ====");
     obj1.insert("kiran", " engineer", " unmarried");
     System.out.println(" ");
     System.out.println("====important detail====");
     obj1.setdetails("GPLC", "bachelor", 21);
     System.out.println(" ");
     obj1.display();
     modifiers obj2=new modifiers();
     System.out.println("====personal information of sandesh====");
     obj2.insert("sandesh khatiwada","data science","married");
     System.out.println(" ");
     System.out.println("====important detail====");
     obj2.setdetails("GPLC","Bachelor",19);
     obj2.display();

 }
}

