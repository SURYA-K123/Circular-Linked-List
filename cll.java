class CircularLinkedList {
    Node head;
    Node tail;
    class Node
    {
        int data;
        Node next;
        Node (int data)
        {
            this.data=data;
            Node next=null;
        }
    }
    void push(CircularLinkedList cll,int data)
    {
        Node a=new Node(data);
        if(cll.head==null)
        {
            cll.head=a;
            cll.tail=a;
            a.next=a;
            return;
        }
        a.next=cll.head;
        cll.head=a;
        cll.tail.next=cll.head;
    }
    void insertafter(CircularLinkedList cll,int data1,int data2)
    {
        Node a=new Node(data2);
        if(cll.head==null)
        {
            cll.head=a;
            cll.tail=a;
            a.next=a;
            return;
        }
        Node s=cll.head;
        while(s.next!=head && s.data!=data1)
        {
            s=s.next;
        }
        if(s.data==data1)
        {
            a.next=s.next;
            s.next=a;
            return;
        }
        System.out.println(data1+" not found to insert");
    }
    void append(CircularLinkedList cll,int data)
    {
        Node a=new Node(data);
        if(cll.head==null)
        {
            cll.head=a;
            cll.tail=a;
            a.next=a;
            return;
        }
        Node s=cll.head;
        while (s!=tail)
        {
            s=s.next;
        }
        a.next=s.next;
        s.next=a;
    }
    void delete(CircularLinkedList cll,int data)
    {
        Node s = cll.head;
        Node k=null;
        if(cll.head==null)
        {
            System.out.println("List is empty");
            return;
        }
        while(s.next!=head && s.data!=data)
        {
            k=s;
            s=s.next;
        }
        if(s.data==data)
        {
            k.next=s.next;
            s.next=null;
            return;
        }
        System.out.println(data+" not found to delete");
    }
    void print(CircularLinkedList cll)
    {
        System.out.print(head.data+" ");
        Node a=cll.head.next;
        while(a!=head)
        {
            System.out.print(a.data+" ");
            a=a.next;
        }
    }
    public static void main(String[] args)
    {
        CircularLinkedList cll =new CircularLinkedList();
        cll.push(cll,1);
        cll.push(cll,3);
        cll.push(cll,4);
        cll.insertafter(cll,4,2);
        cll.delete(cll,2);
        cll.print(cll);
    }
}
