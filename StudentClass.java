import java.io.ObjectInputStream.GetField;

public class StudentClass {
  public static void main(String[] args) {
    Student x = new Student(1, "ANUJ", 96.25);
    System.out.println(Student.GetNOS());
  }

}

class Student {
  String name;
  int rno;
  double percentage;
  private static int NOS;

  Student(int rno, String name, double percentage) {
    this.name = name;
    this.rno = rno;
    this.percentage = percentage;
    ++NOS;
  }
  public static int  GetNOS(){
    return NOS;
  }
}
