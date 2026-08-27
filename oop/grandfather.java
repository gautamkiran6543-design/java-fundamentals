public class grandfather {
    String house;
    String property;
    void shop(String name,String property){
        System.out.println(name);
        System.out.println(property);

    }
}
public class father extends grandfather{ // inheritance grand father to father
    void property(){
        System.out.println("here father inherit shop and property of grand father");
    }
}
public  void main(String []args){
    father o1=new father();
    o1.shop("Bar","Variety of drinks");
    o1.property();


}
