public class thread_and_multithreading implements Runnable {
    public static void main(String[] args) {

        System.out.println("Thread Name: "+Thread.currentThread().getName());
        
    }

    @Override
    public void run() {
        System.out.println("Code Executed By Thread: "+Thread.currentThread().getName());
    }
}

