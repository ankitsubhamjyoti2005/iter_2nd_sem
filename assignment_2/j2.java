class Complex{
    double real, img;
    public void setdata(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public static void display(Complex temp){
        System.out.printf("Sum = "+temp.real+temp.img);
    }
}

public class j2 {
     public static Complex add(Complex n1, Complex n2) {
        Complex temp = new Complex();

        temp.real = n1.real + n2.real;
        temp.img = n1.img + n2.img;

        return(temp);
    }

    public static void main(String[] args) {
        Complex n1 = new Complex(),
                n2 = new Complex(),
                temp;
        n1.setdata(4.9,8.3);
        n2.setdata(3.9,5.3);

        temp = add(n1, n2);

        Complex.display(temp);
    }
}
