public class listl {
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
    }
  }



  // display recursively 
  public static void displayr(Node head)
  {
    if(head==null) return ;
    System.out.println(head.data);
    displayr(head.next);
  }


// display reversr order



  public static void display_rev(Node head)
  {
    if(head==null) return ;
    display_rev(head.next);
    System.out.println(head.data);
  }
//Display

  public static void display(Node head)
   {
      while(head!=null)
      {
        System.out.println(head.data);
        head=head.next;
      }
   }

   
  public static void main(String[] args) {
    Node a = new Node(5);
    Node b = new Node(10);
    Node c = new Node( 15);
    Node d = new Node(20);
    Node e= new Node(25);
   a.next=b;
   b.next=c;
   c.next=d;
   d.next=e;
  // e.next=null;
  // System.out.println(b.data);

  // displaying the Linkidlist 


  //  Node temp=a;
  //  while (temp!=null) {
  //   System.out.print(temp.data+" ");
  //   temp=temp.next;
    
  //  }
   
   display(a);
   System.out.println("this is the recusively function ");
   displayr(a);
   System.out.println("print reverse element this function ");
   display_rev(a);
  }
}