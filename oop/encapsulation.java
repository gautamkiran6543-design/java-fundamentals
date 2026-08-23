public class encapsulation {
    private String name;
    private int age;
    //using setter
    public void setdetails(String name,int age){
        this.name=name;
        this.age=age;
    }
    //getter
    public String getdetails(){
        return name;

    }
    //getter
    public int setage(){
        return age;
    }
    public static void main(String[]args){
        encapsulation obj=new encapsulation();
        obj.setdetails("kiran",21);
        System.out.println("name="+obj.getdetails());
        System.out.println("age="+obj.setage());


    }
}
