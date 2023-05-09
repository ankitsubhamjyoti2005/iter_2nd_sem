import java.util.*;
public class q1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        int luckynumber = sc.nextInt();
        try {
            if (luckynumber < 0)
            {
                throw new NumberFormatException("Negative number");

            }
            System.out.println("Your lucky number is: " + luckynumber);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
