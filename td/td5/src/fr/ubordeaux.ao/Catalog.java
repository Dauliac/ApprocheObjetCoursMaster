import java.util.ArrayList;
import java.util.List;

// Agregate Objects
// TODO: check for a good singleton patern
public class Catalog {
    private final int id;
    private List<Product> products;

    public Catalog(final int id) {
        this.id = id;
        products = new ArrayList<Product>();
    }

    private Reference getNewProductReference() {
        // Find latest ref
        final Product latedProduct = this.products.get(this.products.size() - 1);

        // Ask to latest ref the next reference
        return latedProduct.id.getNextRef();
    }

    public Product addNewProduct(
        Name name,
        Description description,
        int price
    ) {
        final Reference newRef = this.getNewProductReference();

        newProduct = new Product(newRef,
            this.id,
            name,
            description,
            price);
        this.products.add(newProduct);
        return newProduct.id;
    }
}