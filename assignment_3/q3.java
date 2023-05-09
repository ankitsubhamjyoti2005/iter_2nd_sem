import java.util.Scanner;

class MarksOutOfBoundException extends Exception
{
    MarksOutOfBoundException(String message)
    {
        super(message);
    }
}
class Student
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Student :");
        String name =sc.nextLine();
        System.out.println("Enter marks ");
        try{
            double mark=sc.nextInt();
            if(mark>100)
                throw new MarksOutOfBoundException("Mark cannot be greater than 100");

            System.out.println(name+" has got "+mark);
        }
        catch(MarksOutOfBoundException e)
        {
            System.out.println(e);
        }
    }
}