package ExceptionHandling;

public class NullPointer {
    static int size = 0;
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            size++;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(1);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(size);
        Node temp = a;
        try{
            for (int i=0;i<size+2;i++){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }catch (Exception ee){
            System.out.println(ee);
        }

        System.out.println("hello");


    }

}
