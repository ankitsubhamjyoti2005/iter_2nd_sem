import java.util.Scanner;

public class a1_q9 {
    public static double sumMajorDiagonal(double[][] arr){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int t = 4;
        double sum = 0;
        for (int i =0 ; i<n;i++){
            for (int j = 0; j<t;j++) {
                System.out.println("enter element:");
                double q = sc.nextInt();
                arr[i][j]=q;
                sum = sum+q;
            }
        }

        int c = 0;
        for (int i =0 ; i<n;i++){
            for (int j = 0; j<t;j++) {
                System.out.print(arr[i][j]+" ");
                c++;
                if (c==4){
                    System.out.println();
                    c=0;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        double[][] ar=new double[4][4];
        double s = sumMajorDiagonal(ar);
        System.out.println(s);
    }
}
