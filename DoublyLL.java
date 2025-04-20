public class DoublyLL {
  public static class Node{
    int val;
    Node next;
    Node prev;
    Node(int val)
    {
      this.val=val;
    }
  }
  public static void display(Node head)
  {
    Node temp= head;
    while (temp!=null) {
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
    
  }

  public static void displayrev(Node tail)
  {
    Node temp=tail;
    while(temp!=null)
    {
      System.out.print(temp.val+" ");
      temp=temp.prev;
    }
  }
  public static void display2(Node random)
  {
    //give random node 
    Node temp=random;
    while(temp.prev!=null)
    {
      temp=temp.prev;
    }
    display(temp);
  }

  public static void main(String[] args) {
    //4 10 2 99 13
      Node a=new Node(1);
      Node b=new Node(10);
      Node c=new Node(2);
      Node d=new Node(99);
      Node e=new Node(13);
      a.next=b;
      b.next=c;
      b.prev=a;
      c.next=d;
      c.prev=b;
      d.next=e;
      d.prev=c;
      e.prev=d;
      display(a);
      System.out.println();
      displayrev(e);
      System.out.println("");
      display2(c);
  }
  
}
