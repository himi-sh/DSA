public class Inc {
    public static void main(String[] args) {
        boolean b =  EqualOrNot(4, 2 , 2, 4);
        System.out.println(b);
    }


static boolean EqualOrNot(int h1, int h2, int v1,int v2){
    //int r1=true;
    if (h1 > h2) {
        while (h2<=h1) {

           if(h1==h2) {
               return true;
           }
            h1= h1 +v1;
            h2= h2 +v2; 
        }
    } else {
        while (h1 < h2) {
           if(h1==h2) {
               return true;
           }
            h1= h1 +v1;
            h2= h2 +v2; 
        }
    }
    return false;
}
}

