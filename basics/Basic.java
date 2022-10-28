package basics;

import java.util.Scanner;
import java.util.*;


public class Basic {

   
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
    
}
