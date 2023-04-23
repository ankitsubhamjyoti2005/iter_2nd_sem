class Person
{
    String name;
    int age;
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person
{
    int Eid;
    double salary;
    public Employee(String name, int age, int Eid, double salary)
    {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    public void empDisplay()
    {
        System.out.println(  name+"\t\t"+ age+"\t"+Eid+"\t"+salary);
    }
}
public class j7
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("ankit", 18, 72563, 8362300000.34);
        Employee emp2 = new Employee("unkown", 45, 85478, 6343485.25);
        System.out.println("Emp_Name\t" +"Age:\t" +"Emp_ID \t"+"Salary\t");
        emp1.empDisplay();
        emp2.empDisplay();
    }
}
