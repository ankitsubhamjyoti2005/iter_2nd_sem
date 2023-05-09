import java.util.Scanner;

public class q8
{

    public static void main(String[] args)
    {
        int ans=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to reverse: ");
        int n = sc.nextInt();
        System.out.print("The reverse of the given number is: ");
        reverseNumber(n);

    }

    public static void  reverseNumber(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        } else {

            System.out.print(n % 10);


            reverseNumber(n / 10);
        }
    }
}