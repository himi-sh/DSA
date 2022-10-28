import java.util.Scanner; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class temp {
	public static void main (String[] args) {
       Scanner s = new Scanner(System.in);
					  int N=s.nextInt();
					  int arr[][]=new int[N][N];
					  for(int i=0;i<N;i++){
						  for(int j=0;j<N;j++){
							  arr[i][j]=s.nextInt();
						  }
						  }
						  int d=0,f=0;
						  for(int i=0;i<N;i++){
						  for(int j=0;j<N;j++){
							  if(((i+j)%2==0) && arr[i][j]==0){
                               d++;
							  }
						     if(((i+j)%2!=0) && arr[i][j]==1){
								  d++;
							  }
						 
							  if(((i+j)%2==0) && arr[i][j]==1){
                               f++;
							  }
						     if(((i+j)%2!=0) && arr[i][j]==0){
								  f++;
								  }
}
						  }
						  if(d<f){
							  System.out.println(d);
						  }
						  else{
						  System.out.println(f);
						  }
	}
}