public class occuranceOfCharInString {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int findCharInString(String s, char c) {
        int count = 0;
        for(char value : s.toCharArray()) {
            if(value == c){
                count++;
            }
        }
        return count;
    }

    // replace method
    public static int findCount(String s, char c) {
        String value = String.valueOf(c);
        String new_s = s.replace(value, "");
        return s.length() - new_s.length();
    }
}
