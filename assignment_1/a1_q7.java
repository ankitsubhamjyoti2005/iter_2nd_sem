import java.util.Scanner;

public class a1_q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("enter the elemwnt " + i + " :");
            int g = sc.nextInt();
            arr[i] = g;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                max = arr[i];
            }
        }
        //occ in max
        int max_count = 0;
        for(int i = 0 ;i< arr.length;i++){
            if (arr[i]==max){
                max_count++;
            }
        }
        //occ in min
        int min_count = 0;
        for(int i = 0 ;i< arr.length;i++){
            if (arr[i]==min){
                min_count++;
            }
        }
        //first occur
        int f_occ = 0;
        for(int i = 0 ;i< arr.length;i++){
            if (arr[i]==max){
                f_occ=i;
                break;
            }
        }
        //last occr
        int l_occ = 0;
        for(int i = (arr.length-1) ;i>0 ;i--){
            if (arr[i]==min){
                l_occ=i;
                break;
            }
        }
        System.out.println("tke max element is "+max+" the occ is:"+max_count);
        System.out.println("the min element is "+min+" the occ is:"+min_count);
        System.out.println("first occ of  max "+f_occ);
        System.out.println("ast occ of min "+l_occ);
    }
}