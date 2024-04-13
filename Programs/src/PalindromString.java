public class PalindromString {

    public static void main(String[] args) {
        System.out.println(checkPalindrom("abba"));
        System.out.println(compareString("abba"));
        System.out.println(compareString1(""));
    }

    public static boolean checkPalindrom(String s) {
        boolean status = false;
        StringBuilder rev = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--) {
            rev.append(s.charAt(i));
        }
        System.out.println(s +" " + rev);
        if(s.contentEquals(rev)) {
            status = true;
        }
        return status;
    }

    public static boolean compareString(String s) {
        char[] c = s.toCharArray();
        int first = 0 , last = c.length - 1;
        while(first <= last){
            if(c[first] != c[last]){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    public static boolean compareString1(String s) {
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
