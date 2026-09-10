public final class finalclass {//it means it cannot be inherited by another class
    void detail(final int age){
        System.out.println("Age="+age);
    }
    public void main(String []args){
        finalclass o=new finalclass();
        o.detail(89);

        }
    }


