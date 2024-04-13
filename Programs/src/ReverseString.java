public class ReverseString {

    public static void main(String[] args) {
        String s = "Khushbu";
        System.out.println(ReverseString.reverseString(s));
    }

    public static String reverseString(String s) {
        String rev = null;
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}

class Solution2 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Solution2.reverseString("Khushbu"));
    }

    public static String reverseString(String s) throws InterruptedException {
        StringBuffer sb = new StringBuffer();
        Thread.sleep(1000);
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void stringConcept() {
        String k = "khushbu", d = "dipen", d1 = "deep";
        String dk = k + d + d1;
        System.out.println(dk);
    }
}


// String                    StringBuffer                    StringBuilder
// immutable                    mutable                         mutable
// thread safe                thread safe                   not thread safe


// Thread safe > multiple threads can not append values at same time
// Not Thread safe > multiple threads can append values at same time.