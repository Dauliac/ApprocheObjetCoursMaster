
public class Order {
    private final int id;
    private final Reference productReference;
    //TODO Add quantity class that can only be > 0
    private final int quantity; 

    public void Order(Reference productReference, int quantity=1) {
        //TODO database give ?
        this.id = null;
        this.productReference = ref;

        this.quantity = quantity;
    }
    public getReference(){
        return this.productReference;
    }
    public int increaseQuantity(int addQuantity=1) {
        this.quantity += addQuantity;
        return this.quantity;
    }
}