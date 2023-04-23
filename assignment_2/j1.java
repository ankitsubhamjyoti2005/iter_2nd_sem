import java.util.Scanner;

class phone{
    int area_code;
    int exchange;
    int number;

     void input(int area_code, int exchange,int number ) {
        this.area_code = area_code;
        this.exchange = exchange;
        this.number = number;
    }

    void display(){
        System.out.println("("+area_code+")"+" "+exchange+" "+number);
    }
}
public class j1 {
    public static void main(String[] args) {
        phone my = new phone();
        my.input(212,767,8900);


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your area code:");
        int a_code = sc.nextInt();
        System.out.println("enter exchange code:");
        int e_code = sc.nextInt();
        System.out.println("enter the number:");
        int num = sc.nextInt();
        //yout ph number
        phone your = new phone();
        your.input(a_code,e_code,num);



        System.out.print("My number is ");
        my.display();
        System.out.print("Your number is ");
        your.display();

    }
}
