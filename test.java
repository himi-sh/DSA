import java.util.*;
public class test {
    public static void main (String[]args){
       
      
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Choose times-");
		int n = sc.nextInt();
	 	for (int i = 1; i<=n; i++) {
			for (int j = 1; j < i; j++) {

					if (j == 1) {
						System.out.print("*");
					}
					if (j != 1) {
						System.out.print("&");
					}
					if (j != 1 && j == i-1) {
						System.out.print("*");
					}
			}
			System.out.println();
			if (i==n){
				for (int z=1; z<=n+1; z++){
					System.out.print("*");
				}
			}

			
            }
            sc.close();
        }
    }