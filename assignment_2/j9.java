class student{
	int roll;
	String name;
	String course;
	void input_student(int roll,String name,String course){
		this.roll = roll;
		this.name = name;
		this.course = course;
	}
	void dispay(){
		System.out.println(this.roll);
		System.out.println(this.name);
		System.out.println(this.course);
	}
}

class exam extends student{
	int marks1;
	int marks2;
	int marks3;
	void input_marks(int marks1,int marks2,int marks3){
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	void dispay_resule(){
		System.out.println(this.marks1);
		System.out.println(this.marks2);
		System.out.println(this.marks3);
	}
}
public class j9 {
    public static void main(String[] args) {
    	exam e[] = new exam[5];
    	for(int i =0 ; i<5;i++){
    		e[i] = new exam();
    	}
    	e[0].input_student(224101228,"Satyajeet","B.A IN Home sciene");
    	e[0].input_marks(10,15,10);
    	e[1].input_student(224101228,"Satyajeet","B.A IN Home sciene");
    	e[1].input_marks(10,15,10);
    	e[2].input_student(224101228,"Satyajeet","B.A IN Home sciene");
    	e[2].input_marks(10,15,10);
    	e[3].input_student(224101228,"Satyajeet","B.A IN Home sciene");
    	e[3].input_marks(10,15,10);
    	e[4].input_student(224101228,"Satyajeet","B.A IN Home sciene");
    	e[4].input_marks(10,15,10);
    	for(int i =0 ; i<5;i++){
    		System.out.println("the result of student"+(i+1));
    		e[i].dispay_resule();
    	}
    	
    	
    	
    	
    }
}
