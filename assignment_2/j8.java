interface DetailInfo
{
    void display();
    int count();
}
class Persons implements DetailInfo
{
    static int maxcount = 15;
    String name;
    public Persons(String name)
    {
        this.name = name;
    }
    public void display()
    {
        System.out.println("Name: " + name);
    }
    public int count()
    {
        return name.length();
    }
}
class j8 {
    public static void main(String[] args)
    {
        Persons p = new Persons("ANKIT");
        p.display();
        int count=p.count();
        System.out.println("Name length: " + count);
    }
}