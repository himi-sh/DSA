
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.BigInteger;  
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc > 0) {
            tc--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(calculatePower(a, b, c));
        }
    }

    static double calculatePower(long a, long b, long c) {
        double mod = 1e9+7;

        double intermed = Math.pow(b,c);
        double ans = Math.pow(a,intermed);

        

        System.out.println(intermed);
        System.out.println(ans);

        return ans;
    }

    static long exponent(long a, long b, double mod) {
        long m = 1000000007;
        long result = 1;
        while(b>=0) {
            if ( (b & 1) > 0) {
                result = result*a%m;
                a = a*a % m;
                b >>=1;
            }
        }
        return result;
    }





 // BigInteger exp = (BigInteger)1e9+7;
        // BigInteger big1,big2,exp,result;  
        // initialize all BigInteger objects  
        // big1=new BigInteger("13");  
        // big2=new BigInteger("5");  
        // exp=new BigInteger("2");  
                     //perform modPow operation on big1 using big2 and exp  
        // BigInteger result= b.modPow(exp,c); 
}
