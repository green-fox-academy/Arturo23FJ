import java.util.Arrays;

public class Anagram {

    public boolean isAnagram(String text1, String text2){
        if (text1.length() != text2.length()){
            return false;
        }
        char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]){
                return false;
            }
        }
        return true;
    }
}
