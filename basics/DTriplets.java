package basics;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class DTriplets {
	static int countTriplet(int arr[], int n, int p){
		int maxVal = 0;
        for (int i = 0; i < n; i++)
            maxVal = Math.max(maxVal, arr[i]);
        int[] freqcy = new int[maxVal + 1];
        for (int i = 0; i < n; i++)
            freqcy[arr[i]]++;
 
        int ans = 0; 
 
        ans += freqcy[0] * (freqcy[0] - 1) * (freqcy[0] - 2) / 6;
 
        // Case 2: 0, x, x
        for (int i = 1; i <= maxVal; i++)
            ans += freqcy[0] * freqcy[i] * (freqcy[i] - 1) / 2;
 
        // Case 3: x, x, 2*x
        for (int i = 1; 2 * i <= maxVal; i++)
            ans += freqcy[i] * (freqcy[i] - 1) / 2 * freqcy[2 * i];
 
        for (int i = 1; i <= maxVal; i++) {
            for (int j = i + 1; i + j <= maxVal; j++)
                ans += freqcy[i] * freqcy[j] * freqcy[i + j];
        }
 
        return ans;
	}
	public static void main (String[] args) {
      Scanner s = new Scanner(System.in);
	   int n = s.nextInt();
	   int p = s.nextInt();
	   int arr[] = new int[n];
	   for (int i=0; i<n; i++){
		   arr[i] = s.nextInt();
	   }
    //    System.out.print(countTriplet(arr, n, p));
        System.out.print(countDtriplet(arr, n, p));
    }
    
    static int countDtriplet(int arr[], int n, int p){
        int count = 0;
        System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(arr);
        return count;
    }


// 5 4
// 1 3 2 5 9

// Sample Output:-
// 4

// Explanation:-
// (1, 3, 2), (1, 3, 5), (1, 2, 5), (2, 3, 5) are the required triplets
}
