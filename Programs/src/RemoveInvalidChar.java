public class RemoveInvalidChar {

    public static void main(String[] args){
        System.out.println(removeJunk("Test 07@#(S)t=ri?:ng4"));
        System.out.println(removeSpecialChar("Test 07@#(S)t=ri?:ng4"));
    }

    public static String removeJunk(String s) {
        return s.replaceAll("[^A-Za-z]", "");
    }

    public static String removeSpecialChar(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
