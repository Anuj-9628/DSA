
public class DoublyLL {
  public static class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public static void display(Node head) {
    System.out.println("");
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }

  }

  public static void displayrev(Node tail) {
    Node temp = tail;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.prev;
    }
  }

  public static void display2(Node random) {
    // give random node
    Node temp = random;
    while (temp.prev != null) {
      temp = temp.prev;
    }
    display(temp);
  }

  public static Node InsertAthead(Node head, int val) {
    Node temp = new Node(val);
    temp.next = head;
    head.prev = temp;
    head = temp;
    return head;

  }

  public static void InsertAtTail(Node head, int val) {
    Node temp = new Node(val);
    Node t = head;
    while (t.next != null) {
      t = t.next;
    }
    t.next = temp;
  }

  public static void InsrtAtIndex(Node head, int index, int val) {
    Node temp = new Node(val);
    Node t = head;
    if (head == null && index != 0) {
      System.out.println("List is empty can not insert at index " + index);
      return;
    }
    for (int i = 1; i < index; i++) {
      t = t.next;
    }
    temp.next = t.next;
    temp.prev = t;
    t.next = temp;

  }

  public static Node Delhead(Node head) {
    Node temp = head;
    head = head.next;
    head.prev = null;
    return head;
  }

  public static Node Deltail(Node head) {
    Node temp = head;
    if (head == null) {
      System.out.println("List is empty");
      return null;
    } else if (temp.next == null) {
      head = null;
      System.out.println("" + temp.val);
      return null;
    } else {
      while (temp.next != null) {
        temp = temp.next;
      }
      temp = temp.prev;
      temp.next = null;
      System.out.println("" + temp.val);
    }
    return head;
  }

  public static void Palindrom(Node head) {
    Node temp = head;
    Node tail = head;
    if (head == null || head.next == null) {
      System.out.println("plindrom");
      return;
    }
    while (tail.next != null) {
      tail = tail.next;
    }
    while (temp != tail && temp.prev != tail) {
      if (temp.val != tail.val) {
        System.out.println("Not palindrom ");
        return;
      } else {
        temp = temp.next;
        tail = tail.prev;
      }
    }
    System.out.println("string is palindrom");

  }

  // two sum in dubaly linkid list
  public static void Sumequal(Node head, int target) {
    Node temp = head;
    Node tail = head;
    int c = 0;
    while (tail.next != null) {
      tail = tail.next;
    }
    while (temp.val < tail.val) {
      if (temp.val + tail.val == target) {
        System.out.println("value is find ");
        c = 1;
        break;
      } else if (temp.val + tail.val > target) {
        tail = tail.prev;
      }
      if (temp.val + tail.val < target) {
        temp = temp.next;
      }
    }
    if (c != 1) {
      System.out.println("sum is not found");
    }
  }

  public static void main(String[] args) {
    // 4 10 2 99 13
    Node a = new Node(1);
    Node b = new Node(1);
    Node c = new Node(2);
    Node d = new Node(3);
    Node e = new Node(4);
    a.next = b;
    b.next = c;
    b.prev = a;
    c.next = d;
    c.prev = b;
    d.next = e;
    d.prev = c;
    e.prev = d;
    // display(a);

    // displayrev(e);
    // System.out.println();
    // display2(c);
    // Node newHead=InsertAthead(a,100);
    // display(newHead);

    // InsertAtTail(a, 90);
    // a=Deltail(a);
    // if (a != null) {
    // a = Deltail(a);
    // }

    // InsrtAtIndex(a, 3, 50);
    // // Node x = Delhead(a);
    // display(a);
    // Palindrom(a);
    Sumequal(a, 10);
  }

}
