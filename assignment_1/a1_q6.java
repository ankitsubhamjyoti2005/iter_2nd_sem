import java.util.Scanner;

public class a1_q6 {
    public static boolean isOdd(int n){
        boolean odd = false;
        for (int i = 1; i <= n; i++){
            odd = !odd;
        }
        return odd;
    }
    public static void main(String[] args) {
        System.out.println("enter n:");
        Scanner n = new Scanner(System.in);
        int g = n.nextInt();
        if(isOdd(g)){
            System.out.println("odd");
        }else {
            System.out.println("even");
        }
    }
}
