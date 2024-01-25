package javaLab_5thSem;
import java.util.*;
// import java.util.HashMap;
// import java.util.Map;

public class Occurence {
    static void countOccurence(String str) {
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        char[] strarray = str.toCharArray();
        for (char c : strarray) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a string : ");
        String str = sc.next();
        countOccurence(str);
        sc.close();
    }
    
}
