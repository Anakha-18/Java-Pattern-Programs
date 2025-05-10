public class HollowRectanglePattern {
    public static void main(String[] args) {
     int n = 4;   //rows
     int m = 5;   //columns

        //outer loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}