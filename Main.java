import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
    //   Scanner s = new Scanner(System.in);
	//   short T = s.nextShort();
	//   while(T>0){
	// 	  int l = s.nextInt();
	// 	  int r = s.nextInt();
	// 	  int sum = findSndDgtOfPrime(l, r);
	// 	  System.out.println(sum);
	// 	  T--;
	//   }
	 int x = 2147483647;
	 System.out.println(x+2);
	}

	public static int findSndDgtOfPrime(int l, int r) {
		boolean prime[] = new boolean[r];
		// Arrays.fill(prime,true);
		// for(int i=2; i*i <= r; i++){
		// 	if(prime[i]=true){
		// 		for(int j = i*i; j<=r; j++){
		// 			prime[j]=false;
		// 		}
		// 	}
		// }

// 2, 15
// 3, 5, 7, 11, 13 = 1 + 1 = 2
// 2, 3, 5, 7, 11, 13, 17, 19 = 4
		for (int i = l; i < r; i++) {
			if (isPrime(i)) {
				prime[i] = true;
			}
		}
		
		int sumOfSndDgt = 0;
		for(int i=l; i<r; i++){
			if(prime[i]){
				int secondDigit=(i/10)%10;
				sumOfSndDgt += secondDigit;
			}
		}
		return sumOfSndDgt;
	}

	private static boolean isPrime(int N) {
		for (int i = 2; i <= N ; i++) {
			if (N % i == 0 && N != i) {
				return false;
			}
		}
		return true;
	}

}