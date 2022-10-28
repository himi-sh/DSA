package NS;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class IncreasingFrequencySort {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int [n];
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
          
        }
        Integer arr[] = Arrays.stream( a ).boxed().toArray( Integer[]::new );

        Arrays.sort(arr, Collections.reverseOrder());
        for(int i =0;i<n;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
                    }
                    else{
                        hm.put(a[i],1);
                }
        }
           // System.out.print(hm);
        while(!hm.isEmpty()){
            int a1 = a[0];
            int min =Integer.MAX_VALUE;
            for(int c: hm.keySet()){
                if(hm.get(c) < min)
                {
                    min = hm.get(c);
                    a1 = c;
                }
            }

            //System.out.print(a1+"  "+min);   
            while(min-->0){
                System.out.print(a1+" ");
            }
        hm.remove(a1);
        }  
    }
}
