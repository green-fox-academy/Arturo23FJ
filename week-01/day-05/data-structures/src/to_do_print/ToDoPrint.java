package to_do_print;

public class ToDoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String myTodo = "My Todo: \n";
        String dlGames = " - Download games\n \t";
        String game = " - Diablo";
        todoText = myTodo + todoText.substring(0, todoText.length()) + dlGames + game;
        System.out.println(todoText);
    }
}
