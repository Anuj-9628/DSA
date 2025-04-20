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
    int size;

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
        return ;
      }
      else if(index==0){
        insertAtBegining(val);
      }
       else if (size == index) {
        insertAtEnd(val);
      } else {
         Node t=head;
          for(int i=1;i<index;++i){
            t=t.next;
          }
          temp.next=t.next;
          t.next=temp;
      }
      ++size;
    }
  }

  public static void main(String[] args) {
    int option = 1;
    Scanner sc = new Scanner(System.in);
    LL l = new LL();
    System.out.println("0.For Exist\n1.insetion first\n2.insertion last\n3.insetion index\n4.display");
    option = sc.nextInt();
    while (option != 0) {
      int val;
      int index;
      if (option == 1) {
        System.out.println("Enter the value");
        val = sc.nextInt();
        l.insertAtBegining(val);

      }
      if (option == 4) {
        l.display();
      }
      if (option == 2) {
        System.out.println("Enter the value");
        val = sc.nextInt();
        l.insertAtEnd(val);
      }
      if(option==3)
      {
        System.out.println("Enter the index and  value");
        index=sc.nextInt();
        val=sc.nextInt();
        l.insertAtIndex(val,index);
        
      }
      System.out.println("0.For Exist\n1.insetion first\n2.insertion last\n3.insetion index\n4.display");
      option = sc.nextInt();
    }

  }

}
