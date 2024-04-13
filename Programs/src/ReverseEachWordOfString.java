public class ReverseEachWordOfString {

    public static void main(String[] args) {
        System.out.println(ReverseEachWordOfString.reverseString("My name is khushbu"));
    }

    public static String reverseString(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j< s.length(); j++){
            String word = words[j];
            for(int i = word.length()-1; i>=0; i--){
                sb.append(word.charAt(i));
            }
            if(j < words.length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}


// created a method that take string as an argument and return a string
// created a string array by splitting string when we found space " "
// stringBuilder reference variable sb is created
// iterate an array and reverse each word, once word is in reverse order add space
// convert stringBuilder object to string and return it.