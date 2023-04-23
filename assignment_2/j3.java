class student{
    String name;
    int DSA_marks;
    int roll;
    public void showdata() {
        System.out.println("name:"+name);
        System.out.println("roll:"+roll);
        System.out.println("DSA: MARKS"+DSA_marks);
    }

    public void setdata(int roll , int DSA_marks , String name) {
        this.roll = roll;
        this.DSA_marks = DSA_marks;
        this.name = name;

    }



}
public class j3 {
    public static void main(String[] args) {
    student s1 = new student();
    student s2 = new student();
    student s3 = new student();
    student s4 = new student();
    student s5 = new student();

    s1.setdata(12341,99,"student1");
    s2.setdata(12342,98,"student2");
    s3.setdata(12343,97,"student3");
    s4.setdata(12344,96,"student4");
    s5.setdata(12345,95,"student5");

    if((s1.DSA_marks>s2.DSA_marks)&&(s1.DSA_marks>s3.DSA_marks)&&(s1.DSA_marks>s4.DSA_marks)&&(s1.DSA_marks>s5.DSA_marks)){
        s1.showdata();
    }else if((s2.DSA_marks>s1.DSA_marks)&&(s2.DSA_marks>s3.DSA_marks)&&(s2.DSA_marks>s4.DSA_marks)&&(s2.DSA_marks>s5.DSA_marks)){
        s2.showdata();
    }else if((s3.DSA_marks>s1.DSA_marks)&&(s3.DSA_marks>s2.DSA_marks)&&(s3.DSA_marks>s4.DSA_marks)&&(s3.DSA_marks>s5.DSA_marks)){
            s3.showdata();
    }else if((s4.DSA_marks>s1.DSA_marks)&&(s4.DSA_marks>s3.DSA_marks)&&(s4.DSA_marks>s2.DSA_marks)&&(s4.DSA_marks>s5.DSA_marks)){
            s4.showdata();
    }else{
        s5.showdata();
    }
    }
}
