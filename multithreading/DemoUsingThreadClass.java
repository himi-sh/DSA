public class DemoUsingThreadClass extends Thread {
    
    @Override
    public void run() {
        System.out.println("Inside Run method => "+ Thread.currentThread().getId());
    }
}
