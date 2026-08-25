//polymorphsim : it mean one name many form where it behave differently in different situations payments method is
// same way using same method nut different forms like esewa,khalti.
public class polymorphismpayment {
    void pay() {
        System.out.println("Making payments method using differnts forms");
    }

    static class esewa extends polymorphismpayment {
        @Override // it is used to extends method or replacing/redefining method that is already in parent class
        void pay() {
            System.out.println("Payments using eswa");
        }
    }

    static class khalti extends polymorphismpayment {
        @Override
        void pay() {
            System.out.println("Payment using khalti");
        }
    }

    static class bank extends polymorphismpayment {
        @Override
        void pay() {
            System.out.println("Payment using banking system");

        }
    }

    public static void main(String[] args) {
        polymorphismpayment o1; // here i create one refrence can work diferent object
        o1=new polymorphismpayment();
        o1.pay();
        o1 = new esewa();
        o1.pay();
        o1 = new khalti();
        o1.pay();
        o1 = new bank();
        o1.pay();
    }
}
