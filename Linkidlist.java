import java.util.*;

public class Linkidlist {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static class LL {
    Node head = null;
    Node tail = null;
    static int size;

    void insertAtBegining(int val) {
      Node temp = new Node(val);
      if (head == null) {
        tail = head = temp;
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

    void insertAtEnd(int val) {
      Node temp = new Node(val);
      if (head == null) {
        insertAtBegining(val);
      } else {
        tail.next = temp;
        tail = temp;
      }
      ++size;
    }

    void insertAtIndex(int val, int index) {
      Node temp = new Node(val);
      if (index > size || index < 0) {
        System.out.println("Wrong index");
        return;
      } else if (index == 0) {
        insertAtBegining(val);
      } else if (size == index) {
        insertAtEnd(val);
      } else {
        Node t = head;
        for (int i = 1; i < index; ++i) {
          t = t.next;
        }
        temp.next = t.next;
        t.next = temp;
      }
      ++size;
    }

    void delhead() {
      Node temp = head;
      if (head == null)
        return;
      if (head.next == null) {
        tail = null;
      }
      head = head.next;
      System.out.println("deleted Node" + temp.data);
      --size;
    }

    void dellast() {
      Node temp1 = tail;
      Node temp2 = head;
      if (head == null)
        return;
      if (head.next == null) {
        System.out.println("Deleted Node :" + head.data);
        head = tail = null;
        --size;
        return;
      }
      while (temp2.next != temp1) {
        temp2 = temp2.next;
      }
      System.out.println("Deleted Node :" + tail.data);
      tail = temp2;
      temp2.next = null;
      --size;
    }

    void delAtIndex(int index) {
      Node temp1 = head;
      Node temp2 = null;
      if (index > size || index < 0) {
        System.out.println("Invalid index");
        return;
      }
      if (index == 0)
        delhead();
      for (int i = 0; i < index - 1; ++i) {
        temp2 = temp1;
        temp1 = temp1.next;
      }
      if (index == size) {
        dellast();
      }
      temp2.next = temp1.next;
      temp1.next = null;
      System.out.println("DeletedNode:" + temp1.data);
      --size;
    }
  }

  public static void main(String[] args) {
    int option = 1;
    Scanner sc = new Scanner(System.in);
    LL l = new LL();
    System.out.println(
        "0.For Exist\n1.insetion first\n2.insertion last\n3.insetion index\n4.display\n5.deleteHead\n6.dellast\n7.DelAtIndex");
    option = sc.nextInt();
    while (option != 0) {
      int val;
      int index;
      switch (option) {
        case 1:
          System.out.println("Enter the value");
          val = sc.nextInt();
          l.insertAtBegining(val);
          break;
        case 2:
          System.out.println("Enter the value");
          val = sc.nextInt();
          l.insertAtEnd(val);
          break;

        case 3:
          System.out.println("Enter the index and  value");
          index = sc.nextInt();
          val = sc.nextInt();
          l.insertAtIndex(val, index);
          break;

        case 4:
          l.display();
          break;

        case 5:
          l.delhead();
          break;
        case 6:
          l.dellast();
          break;
        case 7:
          System.out.println("Enter index");
          index = sc.nextInt();
          l.delAtIndex(index);
          break;
        default:
        System.out.println("invalid input");
          break;
      }
      System.out.println(
          "0.For Exist\n1.insetion first\n2.insertion last\n3.insetion index\n4.display\n5.delhead\n6.Dellast\n7.DelAtIndex");
      option = sc.nextInt();
    }

  }

}
