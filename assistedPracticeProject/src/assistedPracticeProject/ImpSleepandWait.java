package assistedPracticeProject;

public class ImpSleepandWait {

    public static void main(String[] args) {
        Object lock = new Object();

        // Sleep for 3 seconds
        try {
            System.out.println("Sleeping for 3 seconds...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait for another thread to notify
        synchronized (lock) {
            try {
                System.out.println("Waiting to get notified...");
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Done!");
    }
}
