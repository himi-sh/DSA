import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class kPermutation {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();

		HashSet<Integer> s = new HashSet<>();
		for (int i = 1; i <= N; i++) {
			s.add(i);
		}
		String output = "";
		Vector<Integer> v = new Vector<>();
		k--;
		
		int first = v.get(0);
		for (int i = 0 ; i < N; i++) {
			int val = N - i;
			int index = randomIndex(val, k);
			
			if (index < v.size()) {
				output += v.get(index).toString();
				v.remove(index);
			} else {
				output = output + String.valueOf(first+2);
				first = v.get(0); 
			}
		}

	}

	static int randomIndex(int n, int k) {


		if (n==1) return 0;
		n--;
		int partial = n;
		for (; k >= partial && n > 1; n--) {
			// fact = fact * i++;
			partial = partial * (n-1);
		}
		// k = k % partial;
		return k / partial;
		// return partial;
	}

	static long factorial (int N) {
		long fact = 1;
		for (int i = 2; i <= N; i++) {
			fact = fact * i;
		}
		return fact;
	}

}



// permutation(int fact) {

// }

// n = n * n - 1 ..... 3. 2. 1


// 3
// n!
// 3*2*1/ 

// N = 3
// K = 5

// 3*2*1  = 6

