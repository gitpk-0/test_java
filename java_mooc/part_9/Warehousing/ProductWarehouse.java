public class ProductWarehouse extends Warehouse {

    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    public String getName() {
        return this.productName;
    }

    @Override
    public String toString() {
//        return this.productName + ": balance = " + this.getBalance() + ", space left " + howMuchSpaceLeft();
        return  this.productName + ": " + super.toString();
    }

}
