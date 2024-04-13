import java.util.*;

public class uniqueCharInString {

    public static void main(String[] args) {
        LinkedHashSet<Character> uniqueChar = uniqueChar("My name is khushbu");
        for (char c : uniqueChar) {
            System.out.print(c);
        }
        Map<Character, Integer> hm = uniqueCharWithHashMap("My name is khushbu");
        for (char c : hm.keySet()) {
            System.out.println(c);
        }
    }

    public static LinkedHashSet<Character> uniqueChar(String s) {
        s = s.toLowerCase();
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' ') {
                hs.add(s.charAt(i));
            }
        }
        for(char c : s.toCharArray()) {
            if(c != ' '){
                hs.add(c);
            }
        }
        return hs;
    }

    public static Map<Character, Integer> uniqueCharWithHashMap(String s) {
        s = s.toLowerCase();
        Map<Character, Integer> hm = new TreeMap<>();
        for(char c : s.toCharArray()) {
            if(c != ' ') {
                hm.put(c, hm.getOrDefault(c,0) + 1);
            }
        }
        return hm;
    }
}


// We can use HashSet > Result will not maintain a sequence
// We can use TreeSet > Result will be in sorted order
// We can also use hashmap to solve this problem > store each char in key of hashmap as keys are unique