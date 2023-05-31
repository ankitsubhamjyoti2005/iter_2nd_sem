public class a1_q1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int c = 1;
        int count = 0 ;
        while(a>c){
            c=c*2;
            count++;
        }
        //count number of 2
        int g = count - 2 ;
        System.out.println(g);
    }
}
