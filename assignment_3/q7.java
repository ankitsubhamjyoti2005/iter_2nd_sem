import java.util.Scanner;

public class q7
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Choose a Mathematical operation from below :");
            System.out.println("Type 1 to Determine the factorial of a number");
            System.out.println("Type 2 to Determine X^N for two numbers X, N");
            System.out.println("Type 3 to Determine GCD of two numbers");
            System.out.println("Type 4 to Binary equivalent of a decimal number");
            System.out.println("Type 5 for Product of two numbers");
            System.out.println("Type 0 For Exit\nEnter your choice:");
            choice = obj.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter a number: ");
                    int f = obj.nextInt();
                    System.out.println("Factorial of "+f+" is "+Factorial(f));
                    break;
                case 2:
                    System.out.print("Enter X and N : ");
                    int x = obj.nextInt();
                    int y = obj.nextInt();
                    System.out.println( "X^N = "+pow(x, y));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int a = obj.nextInt();
                    System.out.print("Enter second number: ");
                    int b = obj.nextInt();
                    System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
                    break;
                case 4:
                    System.out.print("Enter a decimal number: ");
                    int decimal = obj.nextInt();
                    int binary = find(decimal);
                    System.out.println(decimal + " in binary is " + binary);
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    int c = obj.nextInt();
                    System.out.print("Enter second number: ");
                    int d = obj.nextInt();

                    System.out.print(c + " x " + d + " = " );
                    System.out.print(pro(c,d));
                    break;
                case 0:
                    System.out.println("exiting ...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println();
        }while (choice != 0);
    }

    public static int Factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return (n*Factorial(n - 1));
    }


    public static int pow(int x, int y) {
        if (y == 0)
            return 1;
        else
            return  ( x*pow(x, y - 1));
    }

    public static int gcd(int x,int y) {
        if (y == 0)
            return x ;
        else
            return gcd(y, x % y);
    }

    public static int find(int a) {
        if (a == 0)
            return 0;

        else

            return (a % 2 + 10 * find(a / 2));

    }

    public static int pro(int x,int y)
    {
       return x*y;
    }
}