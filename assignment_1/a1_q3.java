import java.util.Scanner;

public class a1_q3 {
    public static void main(String[] args) {
        System.out.println("Enter num:");
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int g;
        int add=0;
        int pro = 1;
        while (w!=0){
            g=w%10;
            add =add+g;
            pro = pro* g;
            w=w/10;

        }

        if(add==pro) {
            System.out.println("spy num");
        }else{
            System.out.println("not a spy num");
        }
    }
}
