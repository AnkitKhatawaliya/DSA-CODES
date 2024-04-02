public class Threading {
    public static void main(String[] args) {
        Threading threading = new Threading();

        // Create and start threads for each method
        Thread thread1 = new Thread(threading::Print);
        Thread thread2 = new Thread(threading::exec);
        Thread thread3 = new Thread(threading::perfrom);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    void Print() {
        int i = 0;
        while (i < 100000) {
            i++;
            if (i % 500 == 0) {
                System.out.println("Thread One running");
            }
        }
    }

    void exec() {
        int i = 0;
        while (i < 110000) {
            i++;
            if (i % 550 == 0) {
                System.out.println("Thread Two running");
            }
        }
    }

    void perfrom() {
        int i = 0;
        while (i < 120000) {
            i++;
            if (i % 600 == 0) {
                System.out.println("Thread Three running");
            }
        }
    }
}
