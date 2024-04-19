import java.util.HashMap;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "care";
        String s2 = "race";
        boolean status = anagramCheck(s1, s2);
        System.out.println(status);
    }

    public static boolean anagramCheck(String s1, String s2) {
        if(s1.length() == s2.length()){
            HashMap<Character, Integer> hs1 = new HashMap<>();
            HashMap<Character, Integer> hs2 = new HashMap<>();
            for(char c : s1.toCharArray()){
                hs1.put(c, hs1.getOrDefault(c, 0) + 1);
            }
            for(char c : s2.toCharArray()){
                hs2.put(c, hs2.getOrDefault(c, 0) + 1);
            }
            for(char value : hs1.keySet()){
                if(hs1.get(value) != hs2.get(value)) {
                    return false;
                }
            }
        }
        else{return false;}
        return true;
    }
}
