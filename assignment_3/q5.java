import java.util.*;

public class q5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Integer arr[]=new Integer[5];
        System.out.println("Enter array elements ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search ");
        int find=sc.nextInt();
        int occur=count(arr, find);
        System.out.println("Number of times "+find+" present in the array is "+occur);
        sc.close();
    }
    public static <T> int count(T[] array,T item)
    {
        int count =0;
        for(int i=0;i<array.length;i++) {
            if (array[i] == item)
                count++;
        }
        return count;
    }
}