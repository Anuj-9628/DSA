public class LinklistImplimentation {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static class Linkidlist {
    Node head = null;
    Node tail = null;
    int size;

    Void insertAtEnd(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = temp;
      } else {
        tail.next = temp;

      }
      tail = temp;
      size++;
      return null;

    }

    void insertAt(int inx, int val) {
      Node t = new Node(val);
      if (inx == 0) {
        insertAtBegining(val);
      } else if (inx == size) {
        insertAtEnd(val);
      } else if (inx > size || inx < 0) {
        System.out.println("wrong index");
      } else {
        Node temp = head;
        for (int i = 1; i < inx; ++i) {
          temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        size++;
      }

    }

    void insertAtBegining(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = tail = temp;

      } else {
        temp.next = head;
        head = temp;
      }
      ++size;

    }

    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;

      }
    }

    // int size() {
    // Node temp = head;
    // int count = 0;
    // while (temp != null) {
    // ++count;
    // temp = temp.next;
    // }

    // return count;
    // }

    int getAt(int a) {
      Node temp = head;
      if (a > size || a < 0)
        return -1;
      else {
        for (int i = 0; i < a; ++i) {
          temp = temp.next;
        }
      }
      return temp.data;
    }

    void DeleteAtIndex(int indx)
    {
      Node temp=head;
      if(indx >= size || indx<0 )
      System.out.println("wrong index");
      else if(indx==0)
      {
        System.out.println("delete data is "+head.data);
        head=head.next;
        if(head==null)
        tail=null;
      }
      else
      {
        for(int i=1;i<indx;++i)
        {
          temp=temp.next;
        }
        System.out.println("deleted index is "+temp.next.data);
        temp.next=temp.next.next;
        if(temp==null)
        {
          tail=null;
        }
      }
      --size;
    }
  }

  public static void main(String[] args) {
    Linkidlist ll = new Linkidlist();
    ll.insertAtEnd(5);
    ll.insertAtEnd(6);
    ll.insertAtEnd(7);
    ll.insertAtBegining(10);
    ll.insertAt(4, 15);
    ll.insertAt(0, 20);
    ll.insertAt(0, 30);
    // ll.insertAt(-10, 30);
    ll.display();
    System.out.println(ll.size + "This is the size of list");
    System.out.println("");
    System.out.println(ll.getAt(3));
    ll.DeleteAtIndex(6);
    ll.display();
    System.out.println("last index data is "+ll.tail.data);

  }

}
