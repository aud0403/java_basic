package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchy = new ProductOrder();
        kimchy.productName = "김치";
        kimchy.price = 5000;
        kimchy.quantity = 1;

        ProductOrder  coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;

        ProductOrder[] orders = {dubu, kimchy, coke};
        int total = 0;
        for (ProductOrder order : orders) {

            System.out.println("상품명 :"+order.productName+
                    ", 가격 : "+ order.price+
                    ", 수량 : " + order.quantity);

            total += order.price * order.quantity;
        }

        System.out.println("총 결제:"  + total);
    }
}
