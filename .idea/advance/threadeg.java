public class threadeg extends Thread {

        // run() contains the task that the thread will perform
        @Override
        public void run() {

                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread: " + i);
                }
            }
        }

        public  void main(String[] args) {

            // Create a thread object
            threadeg t = new threadeg();

            // Start the thread
            // start() creates a new thread and then calls run()
            t.start();

            System.out.println("Main thread is running");
        }


