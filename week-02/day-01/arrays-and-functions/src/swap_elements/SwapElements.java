package swap_elements;

public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`

        String[] orders = {"first", "second", "third"};
        String temp = orders[2];
        orders[2] = orders[0];
        orders[0] = temp;
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }
    }
}
