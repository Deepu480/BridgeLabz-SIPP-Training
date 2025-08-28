package week06_day02_Submission_Functional_Interfaces;

public class BackgroundJobExecution {
    public static void main(String[] args) {
    Runnable job = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Executing job step " + i);
                try {
                    Thread.sleep(500); // simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Background job finished!");
        };

        Thread backgroundThread = new Thread(job);
        backgroundThread.start();

        System.out.println("Main thread is free to do other work...");
    }
}
