import java.util.*;

class Node {
    static Scanner in = new Scanner(System.in);
    protected int regd_no;
    protected float mark;
    protected Node next;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }
    public float getMark() {
        return mark;
    }
    public int getRegd_no() {
        return regd_no;
    }
    public static class LinkedList{
        public  static Node create(Node start)
        {
            System.out.print("Enter registation no :");
            int registation_no=in.nextInt();
            System.out.print("Enter Marks :");
            float mark=in.nextFloat();
            start = new Node(registation_no,mark);
            System.out.println("Linkedlist created...");
            return start;
        }
        //the insertion operation
        //a)i.At the beginning of the list
        public static Node InsBeg(Node start){
            if(start == null){
                    start=create(start);
                    return start;
            }
            System.out.print("Enter registation_no : ");
            int registation_no=in.nextInt();
            System.out.print("Enter Marks : ");
            float mark=in.nextFloat();
            Node node = new Node(registation_no,mark);
            node.next=start;
            System.out.println("Node inserted at the beginning...");
            return node;
        }

        //a)ii.At the end of the list
        public static Node InsEnd(Node start){
            if(start==null) {
                start=create(start);
                return start;
            }
            else{
                System.out.print("Enter registation_no : ");
                int registation_no=in.nextInt();
                System.out.print("Enter Marks : ");
                float mark=in.nextFloat();
                Node node = new Node(registation_no,mark);
                Node temp = start;
                while(temp.next!=null)
                    temp=temp.next;
                temp.next=node;
                System.out.println("the new node is insearted at the end of linklist");
                return start;
            }
        }
        //a)iii.At any position in the list
        public static Node InsAny(Node start){
            Node temp = start;

            System.out.println("enter the position where you want to insert the element");
            int position = in.nextInt();
            if(position == 0){
                start = create(start);
                return start;
            } else if (position == 1) {
                return InsBeg(start);
            }else{
                for(int i=2;i<position;i++) {
                    try{
                        temp = temp.next;
                        if(temp==null)
                            throw new NullPointerException();
                    }
                    catch(NullPointerException e)
                    {
                        System.out.println("position is not present");
                        return start;
                    }
                }
                System.out.print("Enter registation no : ");
                int registation_no = in.nextInt();
                System.out.print("Enter mark: ");
                float mark = in.nextFloat();
                Node newNode = new Node(registation_no,mark);
                newNode.next = temp.next;
                temp.next = newNode;
                System.out.println("Node inserted at the position: "+position);
                return start;
            }
        }
//        b) The deletion operation
//        i. From the beginning of the list
        public static Node DelBeg(Node start){
            int reg_val = start.regd_no;
            float mark_val = start.mark;
            if(start==null)
                System.out.println("list is empty");
            else
            {
                start=start.next;
                System.out.println("Node deleted from the starting of registration number: "+reg_val+" and mark "+mark_val);
            }
            return start;
        }
        //    ii. From the end of the list
        public static Node DelEnd(Node start){
            if(start==null)
                System.out.println("list is empty");
            else if(start.next == null){
                start =null;
                System.out.println("the last element is deleted ans now the linklist is empty");
            }else{
                Node temp = start;
                int reg_val = 0;
                float mark_val = 0;
                while (temp.next.next != null){
                    reg_val = temp.next.next.regd_no;
                    mark_val = start.next.next.mark;
                    temp = temp.next;
                }
                temp.next=null;
                System.out.println("the last node is deleted of reg : "+reg_val+" and marks : "+mark_val);
            }
            return start;
        }
        //        iii. From any position in the list
        public static Node DelAny(Node start){
            System.out.println("enter the position of node which you want to delet");
            int position = in.nextInt();
            if (position == 1) {
                DelBeg(start);
                System.out.println("Node deleted at first position...");
                return start;
            }else {
                Node temp = start;
                int i =2;
                while (i<position){
                    try{
                        temp = temp.next;
                        if(temp==null)
                            throw new NullPointerException();
                    }
                    catch(NullPointerException e) {
                        System.out.println("Invalid position,Nothing to delete...");
                        return start;
                    }
                    i++;
                }
                Node pre = temp;
                pre = pre.next;
                temp.next = pre.next;
                System.out.println("node delet");
                return start;
            }
        }
//        iv.
        public static Node DelReg(Node start){
            if(start==null) {
                System.out.println("list is empty");
                return start;
            }else {
                System.out.print("Enter the registration number of the node to delete: ");
                int reg = in.nextInt();
                Node temp = start;
                Node befor = null;
                if (start.regd_no == reg)
                {

                    System.out.println("Node with regd_no " + reg + " deleted successfully.");
                    return start.next;
                }
                boolean key=true;
                while (temp != null)
                {
                    if (temp.regd_no == reg)
                    {
                        befor.next = temp.next;
                        temp.next = null;
                        System.out.println("Node with regd_no " + reg + " deleted successfully.");
                        key=false;
                        return start;
                    }
                    befor = temp;
                    temp = temp.next;
                }
                try{
                    if(key)
                        throw new NullPointerException();
                }
                catch(NullPointerException e)
                {
                    System.out.println("Node with regd_no " + reg + " not found in the list.");
                }
                return start;
            }
        }
        public static void search(Node start) {
            if (start == null)
                System.out.println("List is empty. Nothing to search.");
            else {
                System.out.print("Enter the registration for search : ");
                float regd_no = in.nextFloat();
                Node temp = start;
                boolean found = false;
                while (temp != null) {
                    if (temp.regd_no == regd_no) {
                        System.out.print("Enter the new mark for the student: ");
                        float newMark = in.nextFloat();
                        temp.mark = newMark;
                        System.out.println("Mark updated.....");
                        found = true;
                    }
                    temp = temp.next;
                }
                try {
                    if (!found)
                        throw new Exception("Not found any node having this regd_no...");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        public static int count(Node start) {
            int count=0;
            Node temp=start;
            while(temp!=null)
            {
                count++;
                temp=temp.next;

            }
            return count;
        }
        public static Node reverse(Node start) {
            Node rev = null;
            Node now = start;
            Node NEW;
            while (now != null)
            {
                NEW = now.next ;
                now.next = rev;
                rev = now;
                now = NEW;
            }
            System.out.println("Link-List reversed");
            return rev;
        }
        public static void display(Node start) {
            Node temp=start;
            if(temp==null)
            {
                System.out.println("Empty link list");
            }
            else
            {
                System.out.println("Regd.no\t\tMarks");
                while(temp!=null)
                {
                    System.out.println(temp.regd_no+"\t\t"+temp.mark);
                    temp=temp.next;
                }
                System.out.println("Alink list is displayed");
            }
        }
        public static void sort(Node start){
            System.out.println("this part is not coded");
        }
    }
        public static void main(String[] args) {
        System.out.println("\n******** MENU ********");
        System.out.println("0: Exit");
        System.out.println("1: Creation");
        System.out.println("2: Display");
        System.out.println("3: Insert at the beginning");
        System.out.println("4: Insert at the end");
        System.out.println("5: Insert at any position");
        System.out.println("6: Delete from the beginning");
        System.out.println("7: Delete from the end");
        System.out.println("8: Delete from any position");
        System.out.println("9:Delete by student regd_no.");
        System.out.println("10: Search and update mark");
        System.out.println("11: Sort the list");
        System.out.println("12: Count the number of nodes ");
        System.out.println("13: Reverse the Linked list");
        Node start = null;
        while (true)
        {
            System.out.print("\nEnter your choice: ");
            int choice = in.nextInt();
            System.out.println();
            switch (choice)
            {
                case 0:
                    System.out.println("**********Thank you*********");
                    System.exit(0);
                case 1:
                    start=LinkedList.create(start);
                    break;
                case 2:
                    LinkedList.display(start);
                    break;
                case 3:
                    start = LinkedList.InsBeg(start);
                    break;
                case 4:
                    start = LinkedList.InsEnd(start);
                    break;
                case 5:
                    start = LinkedList.InsAny(start);
                    break;
                case 6:
                    start = LinkedList.DelBeg(start);
                    break;
                case 7:
                    start = LinkedList.DelEnd(start);
                    break;
                case 8:
                    start = LinkedList.DelAny(start);
                    break;
                case 9:
                    start=LinkedList.DelReg(start);
                    break;
                case 10:
                    LinkedList.search(start);
                    break;
                case 11:
                    //this part is not programed
                    LinkedList.sort(start);
                    break;
                case 12:
                    System.out.println("Number of nodes in the list: " + LinkedList.count(start));
                    break;
                case 13:
                    start = LinkedList.reverse(start);
                    break;
                default:
                    System.out.println("Wrong choice!...please enter a valid choice...");
                    break;
            }
        }
    }
}
