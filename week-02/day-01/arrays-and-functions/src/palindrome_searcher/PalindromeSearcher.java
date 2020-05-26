package palindrome_searcher;

public class PalindromeSearcher {
    public static void main(String[] args) {

    }

    public static void searchPalindrome(String searchInThis){
        String reversed = "";

        for (int i = searchInThis.length() - 1; i >= 0; i--) {
            reversed += searchInThis.charAt(i);
        }
        for (int i = 0; i < searchInThis.length(); i++) {
            
        }
    }
}
