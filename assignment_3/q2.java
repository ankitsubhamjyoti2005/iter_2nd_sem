import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] col = new String[4];
        System.out.println("Enter four colours:");
        for (int i = 0; i < col.length; i++)
        {
            col[i] = sc.nextLine();
        }
        try
        {
            Integer.parseInt(col[0]);

        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        try{
            System.out.println("Enter one more color  ");
            col[col.length]=sc.nextLine();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("The colours entered are ");
        for(int i=0;i<col.length;i++)
            System.out.println(col[i]);
    }
}