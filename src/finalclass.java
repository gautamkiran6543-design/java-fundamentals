public final class finalclass {//it means it cannot be inherited by another class

    void detail(final int age) {
        System.out.println("Age=" + age);
    }

    //class car extends finalclass {
        void detail()
        {
            System.out.println("it cannot br inherited due to final modifier");
        }        public void main(String[] args) {
            finalclass o = new finalclass();
            o.detail(89);
            o.detail();

        }
    }
//}


