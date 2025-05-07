import payments.Employee;
import payments.Invoice;
import payments.Payable;

public class PaymentMain {
    public static void main(String[] args) {
        Payable emp = new Employee("Alice", 5000.0);
        Payable invoice = new Invoice("Laptop", 2, 750.0);

        System.out.println("Employee Payment: $" + emp.getPaymentAmount());
        System.out.println("Invoice Payment: $" + invoice.getPaymentAmount());
    }
}