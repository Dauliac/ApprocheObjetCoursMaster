

// Value Objects
public class Product {
    public final Reference ref;
    public final String name;
    public final Description Description;
    public final int price;

    public Product(
        Reference reference,
        int id_catalog,
        Name name,
        Description description,
        int price
    ) {
        this.ref = reference;
        this.name = name;
        this.price = price;
    }
    
    public Product editProduct(
        Name name=this.name,
        Description description=this.description
    ) {
        return new Product(
            this.reference,
            this.id_catalog,
            name,
            description,
            this.price)
    }
}