
    import java.time.LocalTime;

    public class DigitalClock {

        public static void main(String[] args) throws InterruptedException {

            while (true) {

                LocalTime time = LocalTime.now();

                System.out.println(time);

                Thread.sleep(1000);
            }
        }
    }

