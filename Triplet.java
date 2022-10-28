
import java.util.Arrays;
import java.util.Scanner;

public class Triplet {
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
          System.out.println(arr);
          Arrays.sort(arr);
          System.out.println(arr);
        //   for (int i=0; i<n; i++){
        //     System.out.println(arr[i]);
        //   }
        // 5
        // 1 2 3 4 5
       

        int i = 0;
        int j = 2;
        int ans = 0;
        while (j < n) {
            if (i == j-1) {
                j++;
            } else {
                if (!(Math.abs((arr[j]-arr[i])) <= p)) { 
                    i++;
                } else {
                    int diff = j - i;
                    ans = ans +  (diff * (diff - 1))/2;
                    j++;
                }
            }
            
        }
          return ans;
      }

      static void swap(int arr[], int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
        arr[b]= temp;
	}
}
