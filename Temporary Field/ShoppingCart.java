import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
	
	private List<Item> items;
    private CartTotal totalPrice;

    // constructor
    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalPrice = new CartTotal(items);
    }

    // add item to cart
    public void addItem(Item item) {
        items.add(item);
        totalPrice.updateTotalPrice(item.getPrice());
    }

    // getter for totalPrice
    public double getTotalPrice() {
        return totalPrice.getTotalPrice();
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter item name (or 'exit' to quit):");
            String itemName = scanner.nextLine();
            if (itemName.equals("exit")) {
                break;
            }
            System.out.println("Enter item price:");
            double itemPrice = Double.parseDouble(scanner.nextLine());
            Item item = new Item(itemName, itemPrice);
            cart.addItem(item);
        }
        scanner.close();
        System.out.println("Total price: " + cart.getTotalPrice());
    }
}
