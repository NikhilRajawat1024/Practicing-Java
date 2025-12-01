public class Main {
    public static void main(String[] args) {
        System.out.println("Going inside main thread: "+ Thread.currentThread().getName());
        thread_and_multithreading runnableobj = new thread_and_multithreading();
        Thread thread = new Thread(runnableobj); //This will execute run method which is in the thread_and_multithreading file
        thread.start();
        System.out.println("Finish main method: "+ Thread.currentThread().getName());
    }
}
