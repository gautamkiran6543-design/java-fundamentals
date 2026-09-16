//abstract class means declare class using abstrac t keyword that cant be directly instantiate. and i contain abstract method
//normal method
 abstract class exam {
    //Abstraction: it means hiding unnecessary details and show only the important part
            abstract void result();// inner class
            void details() {
                System.out.println("all the students are passed");
            }

        }
        class students extends exam {
            @Override
            void result(){
                System.out.println("they create different sound");

            }
        }
        public  void main(String[]args){
            exam ob=new students(); //parent class refrence child class object because parent class cant directly create obj.
            ob.details();
            ob.result();
        }

