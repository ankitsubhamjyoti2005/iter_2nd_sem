import java.util.*;
public class a1_q10 {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i =0; i < 3; i++){
            sum = sum + m[i][columnIndex-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m = new double[3][4];
        for (int i =0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("enter element:");
                double g = sc.nextDouble();
                m[i][j] = g;
            }
        }
        double a =sumColumn(m,1);
        double b =sumColumn(m,2);
        double c =sumColumn(m,3);
        double d =sumColumn(m,4);

        System.out.println("Sum of the elements at column 1 is "+a);
        System.out.println("Sum of the elements at column 2 is "+b);
        System.out.println("Sum of the elements at column 3 is "+c);
        System.out.println("Sum of the elements at column 4 is "+d);

    }
}
