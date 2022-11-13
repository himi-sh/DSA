import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    Map<Integer, Integer> map = new HashMap<>();
    // static int count = 0;
    public int fibonacci(int n) {
        // count++;
        if (n < 2) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int fibonacciUsingDP(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            // count++;

            if (n < 2) {
                return n;
            }
              
            int sum = fibonacciUsingDP(n-1) + fibonacciUsingDP(n-2);
            map.put(n, sum);
            return sum;
        }
       
    }

    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();

        // int a = fb.fibonacci(7);
        // System.out.print(a + " in total caluclations " + count);

        int b = fb.fibonacciUsingDP(10);
        System.out.print(b + " in total caluclations " + count);
    }
}
