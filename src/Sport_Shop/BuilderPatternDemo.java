package Sport_Shop;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        OrderBuilder mealBuilder = new OrderBuilder();

        Order order_01 = mealBuilder.order_01();;
        System.out.println("Order 1 :");
        order_01.showItems();
        System.out.println("Total Cost: " + order_01.getCost());

        Order order_02 = mealBuilder.order_02();;
        System.out.println("Order 2 :");
        order_02.showItems();
        System.out.println("Total Cost: " + order_02.getCost());


    }
}
