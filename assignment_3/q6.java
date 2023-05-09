public class q6 {
    public static void main(String[] args)
    {
        Box<String> str1 = new Box<>("BOX STRING");
        Box<String> str2 = str1;
        System.out.println("String1 : " + str1.get());
        System.out.println("Strind2: " + str2.get());
        str1.set("BOX STRING SET");
        System.out.println("String1 : " + str1.get());
        System.out.println("String2 : " + str2.get());

        Box<Integer> int1 = new Box<>(1);
        Box<Integer> int2 = int1;
        System.out.println("Integer 1: " + int1.get());
        System.out.println("Integer 2: " + int2.get());
        int1.set(100);
        System.out.println("Integer 1: " + int1.get());
        System.out.println("Integer 2: " + int2.get());

        Box<Object> objBox = new Box<>(new Object());
        Box<Object> objBox2 = objBox;
        System.out.println("Object 1: " + objBox.get());
        System.out.println("Object 2: " + objBox2.get());
        objBox.set("OBJECT");
        System.out.println("Object 1: " + objBox.get());
        System.out.println("Object 2: " + objBox2.get());
        objBox.set(100);
        System.out.println("Object 1: " + objBox.get());
        System.out.println("Object 2: " + objBox2.get());
    }
}
class Box<T>
{
    public T t;
    public Box(T t)
    {
        this.t = t;
    }
    public T get()
    {
        return t;
    }
    public void set(T t)
    {
        this.t = t;
    }
}