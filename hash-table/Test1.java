import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
 
// don't change the name of this class
// you can add inner classes if needed
class Test1 {
static long mod=(long)(1e9+7);
static long power(long n, long pow){
  long result = 1; 
  n = n % mod;
//   if (n == 0)
//     return 0; 
  
  while (pow > 0){
    if ((pow & 1) != 0) {
        result = ((result%mod) * (n%mod)) % mod;  
    }
    pow = pow >> 1; 
    n = ((n%mod) * (n%mod)) % mod;    
  }
    return result;
}
  public static void main (String[] args) {
                     
    Scanner in = new Scanner(System.in);
    long x=in.nextLong();
    long y=in.nextLong();
    System.out.print(power(x,y));
    
  }
}