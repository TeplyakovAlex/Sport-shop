package Sport_Shop;

public class OrderBuilder {

    public Order order_01() {
        Order order = new Order();
        order.addItem(new WhiteCap());
        order.addItem(new RedTshorts());
        return order;
    }
    public Order order_02() {
        Order order = new Order();
        order.addItem(new BlackCap());
        order.addItem(new BlueTshorts());
        return order;
    }


}
