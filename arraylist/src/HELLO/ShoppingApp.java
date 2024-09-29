
package HELLO;




import java.util.ArrayList;




/*
public class cardItem {
    public static void cart(){
        ArrayList<Object> arr=new ArrayList<>();
        arr.add(data);
        return data;

    }
    public static void showCart(){
        LinkedList<Object>al=new LinkedList<>();
        al.add(cart("sd"));
    }*/



import java.util.Scanner;

import java.util.LinkedList;

// Class for products
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

// Class to manage the shopping cart
class Cart {
    private LinkedList<Product> items;

    public Cart() {
        this.items = new LinkedList<>();
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (Product item : items) {
                System.out.println(item);
            }
        }
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

public class ShoppingApp {
    public static void main(String[] args) {
        // List of available shoes and jackets
        ArrayList<Product> shoes = new ArrayList<>();
        ArrayList<Product> jackets = new ArrayList<>();

        // Adding some sample items
        shoes.add(new Product("Nike Air Max", 120.00));
        shoes.add(new Product("Adidas Ultraboost", 180.00));
        jackets.add(new Product("North Face Jacket", 150.00));
        jackets.add(new Product("Patagonia Jacket", 200.00));

        // Initialize cart and scanner
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        boolean continueShopping = true;

        // Main loop for user interaction
        while (continueShopping) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Shoes to Cart");
            System.out.println("2. Add Jackets to Cart");
            System.out.println("3. Display Cart");
            System.out.println("4. Show Total Amount");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display available shoes and add selected shoe to cart
                    System.out.println("Available Shoes:");
                    for (int i = 0; i < shoes.size(); i++) {
                        System.out.println((i + 1) + ". " + shoes.get(i));
                    }
                    System.out.println("Enter the number of the shoe to add to cart:");
                    int shoeChoice = scanner.nextInt();
                    if (shoeChoice > 0 && shoeChoice <= shoes.size()) {
                        cart.addItem(shoes.get(shoeChoice - 1));
                        System.out.println("Added to cart: " + shoes.get(shoeChoice - 1));
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 2:
                    // Display available jackets and add selected jacket to cart
                    System.out.println("Available Jackets:");
                    for (int i = 0; i < jackets.size(); i++) {
                        System.out.println((i + 1) + ". " + jackets.get(i));
                    }
                    System.out.println("Enter the number of the jacket to add to cart:");
                    int jacketChoice = scanner.nextInt();
                    if (jacketChoice > 0 && jacketChoice <= jackets.size()) {
                        cart.addItem(jackets.get(jacketChoice - 1));
                        System.out.println("Added to cart: " + jackets.get(jacketChoice - 1));
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    // Display the contents of the cart
                    cart.displayCart();
                    break;

                case 4:
                    // Display the total amount of the items in the cart
                    System.out.println("Total Amount: $" + cart.getTotalAmount());
                    break;

                case 5:
                    // Exit the application
                    continueShopping = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}


