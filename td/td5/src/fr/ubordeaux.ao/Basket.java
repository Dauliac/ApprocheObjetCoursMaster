import java.util.ArrayList;
import java.util.List;

public class Basket implements Ibasket {

    private List<Order> orders;
    private float reduction; //percent

    public List<Order> getOrdersList() {
        return this.ortders;
    }

    private OrderId getOderByReference(Reference ref) {
        for (int i = 0; i < this.orders.size(); i++) {
            Order orderToCompare = this.orders.get(i);
            Reference productRef = orderToCompare.getReference();
            if(productRef.equal(ref)
                return orderToCompare;
        }
        return null;
    }

    private Bool isInBasket(Reference ref){
        for (int i = 0; i < this.orders.size(); i++) {
            Reference productRef = this.orders.get(i).getReference();
            if(productRef.equal(ref)
                return true;
        }
        return false;
    }

    private int increaseOrderQuantity(Reference ref, int addQuantity=1) {
        Order order = this.getOderByReference(ref);
        return order.increaseQuantity(addQuantity);
    }

    public List<Order> addToBasket(Reference ref) {

        // In this special case, we'll increace quantity of one.
        if this.isInBasket(ref) {
            this.increaseOrderQuantity(ref, 1)
        } else }{
            // TODO CREATE ORDER, INCREASE REF BY ONE;

        }
        return this.getProductRef;
    }

    public List<Order> getProductsList() {

    }

    
}