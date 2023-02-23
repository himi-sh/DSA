public class DemoUsingRunnableInterface implements Runnable {
    
    @Override public void run() {
        System.out.println("Inside Run method => "+ Thread.currentThread().getId());
    }
}
