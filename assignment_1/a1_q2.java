import java.util.*;
public class a1_q2 {
    public static void main(String[] args) {
        System.out.println("Enter person Weight in kg:");
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        System.out.println("Enter height of person in meter:");
        double h = sc.nextDouble();
        double h2= h*h;
        double bmi = w / h2;
        System.out.println(bmi);

        if(bmi<=18.5){
            System.out.println("Underweight");
        } else if (bmi<24.9) {
            System.out.println("Normal Weight");
        } else if (bmi<29.9) {

            System.out.println("over weight");

        }else {
            System.out.println("obese");
        }


    }
}
