// File: payments/Invoice.java
package payments;

public class Invoice implements Payable {
    private String item;
    private int quantity;
    private double pricePerItem;

    public Invoice(String item, int quantity, double pricePerItem) {
        this.item = item;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}

