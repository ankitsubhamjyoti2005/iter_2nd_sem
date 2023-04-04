import java.util.Scanner;

public class a1_q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array:");
        int n = sc.nextInt();
        int t = sc.nextInt();
        int sum = 0;
        int[][] arr = new int[n][t];
       for (int i =0 ; i<n;i++){
           for (int j = 0; j<t;j++) {
               System.out.println("enter element:");
               int q = sc.nextInt();
               arr[i][j]=q;
               sum = sum+q;
           }
       }

        int c = 0;
        for (int i =0 ; i<n;i++){
            for (int j = 0; j<t;j++) {
                System.out.print(arr[i][j]);
                c++;
                if (c==3){
                    System.out.println();
                    c=0;
                }
            }
        }
        System.out.println("the sum is:"+sum);
    }
}
