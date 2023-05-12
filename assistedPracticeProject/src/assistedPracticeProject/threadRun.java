package assistedPracticeProject;

public class threadRun extends Thread implements Runnable {
    
    public void run() {
        // Code to be executed by the thread
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        // Create a new thread
        threadRun t = new threadRun();
        // Start the thread
        t.start();
    }
}
