import java.util.*;
public class q4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        Integer[] arr = new Integer[5];
        for (int i = 0; i <= 4; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Integer Array contains:");
        printArray(arr);
        System.out.println("Enter array elements:");
        Double[] doub = new Double[5];
        for (int i = 0; i < 5; i++) {
            doub[i] = sc.nextDouble();
        }
        System.out.println("Double Array contains:");
        printArray(doub);
    }
    public static <E> void printArray(E[] arr)
    {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}