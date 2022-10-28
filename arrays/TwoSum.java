import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {6, 8, 9, 10, 11, 15};
        int sum = 16;
        System.out.println(twoSumUsingMap(arr, sum));
        
    }

    private static String twoSumUsingMap(int []arr, int sum) {
        Map<Integer, Boolean> map = new HashMap<>();
        String returnStr = "";
        for (int a: arr) {
            int diff = sum - a;
            if (map.containsKey(diff)) {
                returnStr = diff + ", " + a;
                break;
                // System.out.println(a + ", " + diff);
            } else {
                map.put(a, true);
            }
        }
        return returnStr;

    }
}

// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//      Scanner s = new Scanner(System.in);
//      short t = s.nextShort();
//      while(t-->0){
//          int n = s.nextInt();
//          long arr[] = new long[n];
//          for(int i=0; i<n; i++){
//              arr[i] = s.nextInt();
//          }
//          Arrays.sort(arr);
//          System.out.print(arr[n-1]+" ");
//          System.out.print(arr[n-2]+" ");
//          System.out.print(arr[n-3]+" ");
//          System.out.println();
//      }
    
//     }
// }

