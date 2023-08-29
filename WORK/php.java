public class ShoppingCart {
    private List<Item> items = new ArrayList<Item>();
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }
    
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    Item item = new Item("Product name", 19.99);
shoppingCart.addItem(item);

}
public class Product {
    private String name;
    private double price;
    private String description;
    
    // getters and setters
}
public List<Product> search(String query) {
    List<Product> matchingProducts = new ArrayList<Product>();
    for (Product product : products) {
        if (product.getName().toLowerCase().contains(query.toLowerCase())) {
            matchingProducts.add(product);
        }
    }
    return matchingProducts;
}
public class Order {
    private List<Item> items = new ArrayList<Item>();
    private double totalPrice;
    private String customerName;
    private String shippingAddress;
    
    // getters and setters
}
Order order = new Order();
order.setItems(shoppingCart.getItems());
order.setTotalPrice(shoppingCart.getTotalPrice());
order.setCustomerName("John Doe");
order.setShippingAddress("123 Main St.");
