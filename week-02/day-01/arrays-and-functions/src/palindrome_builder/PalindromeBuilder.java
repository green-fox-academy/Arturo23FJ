package palindrome_builder;

public class PalindromeBuilder {
    public static void main(String[] args) {
        System.out.println(palindromeBuilder("greenfox"));
    }

    public static String palindromeBuilder(String toBuild){
        String reversed = "";
        for (int i = toBuild.length() - 1; i >= 0; i--) {
            reversed += toBuild.charAt(i);
        }
        String palindrome = toBuild + reversed;
        return palindrome;
    }
}
