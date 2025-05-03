import java.util.*;
public class Hashset {
   static int  LogestLenght(int []nums)
  {
    HashSet<Integer>st=new HashSet<>();
    for(int num:nums)st.add(num);
    int MaxStreak=0;
   for(int num:st){
    if(!st.contains(num-1)){
      int curNum=num;
      int currStreak=1;
      while(st.contains(curNum+1)){
        currStreak++;
        curNum++;
      }
      MaxStreak=Math.max(currStreak, MaxStreak);
    }
   }
  return MaxStreak;
  }
  public static void main(String[] args) {
    HashSet<String>st=new HashSet<>();
    st.add("james");
    st.add("scote");
    st.add("james");
    st.add("james");
    System.out.println(" "+st);
    System.out.println(st.contains("james"));
    System.out.println(st.size());
    System.out.println(st.remove("james"));
    for(String s:st){
      System.out.println(s);
    }
   int  []nums={99,100,1,4,3,200,2};
    System.out.println(LogestLenght(nums));
    }
}
