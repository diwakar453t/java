package Shoes;

public class addToCart {

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (Product item : items) {
                System.out.println(items);
            }
        }
    }
}
