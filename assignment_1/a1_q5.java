import java.util.Scanner;
public class a1_q5 {
    public static int Sum_of_digits(int sum,int num){
        while (num > 0 || sum <= 9)
        {
            if (num == 0)
            {
                num = sum;
                sum = 0;
            }
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter int");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0 ;
        int i = 0;
        System.out.print( i =Sum_of_digits(sum,n));
    }
}
