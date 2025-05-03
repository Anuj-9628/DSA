import java.util.*;
import java.util.HashMap;

public class HashMaps {
  static void HashMapMethod() {
    Map<String, Integer> mp = new HashMap<>();
    mp.put("Akash", 21);
    mp.put("Yesh", 16);
    mp.put("Lav", 17);
    mp.put("Rishika", 19);
    mp.put("Harry", 18);
    // get metho
    // System.out.println(mp.get("Yesh"));
    // System.out.println(mp.get("Ram"));
    mp.put("Akash", 25);// update the value of the key
    // System.out.println(mp.remove("Akash"));// 25
    // System.out.println(mp.remove("Riya"));
    // System.out.println(mp.containsKey("Yesh"));
    mp.putIfAbsent("Yashika", 22);// put in the map
    mp.putIfAbsent("yash", 21);
    // System.out.println(mp);
    // System.out.println(mp.keySet());
    // System.out.println(mp.values());
    // System.out.println(mp.entrySet());
    
    for (String key : mp.keySet()) {
      // System.out.println("Age of " + key + "is " + mp.get(key));
      System.out.printf("Age of %s is %d\n",key,mp.get(key));
    }
  }

  public static void main(String[] args) {
    HashMapMethod();
  }

}
