public class polymorphismpayment {
    void pay() {
        System.out.println("Making payments method using differnts forms");
    }

    static class esewa extends polymorphismpayment {
        @Override
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
        polymorphismpayment o1;
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
