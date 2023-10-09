

import java.math.BigDecimal;
import java.util.Map;

public class Bill {

    /*
    In this exercise you will need to create a class that represents a org.example.Bill.
    This class will be used in the rest of the project.
     */

    // TODO: Add instance variables
    private String customer;
    private Map<String, BigDecimal> products;

    // TODO: Implement two constructors (default [no params] and with params [HINT: Look at the tests ;-D])

    private Bill(){}

    public Bill(Map<String, BigDecimal> products, String customer) {
        this.customer = customer;
        this.products = products;
    }
    public Bill(String customer, Map<String, BigDecimal> products) {
        this.customer = customer;
        this.products = products;
    }

    // TODO: Implement getters and setters

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Map<String, BigDecimal> getProducts() {
        return products;
    }

    public void setProducts(Map<String, BigDecimal> products) {
        this.products = products;
    }


    // TODO: Override toString - Expected output:

    /*
    Customer: John Doe

    Apple: $2.0
    Apricot: $1.5
    Meat: $8.0
    Milk: $4.5

     */

    @Override
    public String toString() {
        String res = "Customer: " + getCustomer() + "\n\n";
        for(Map.Entry<String, BigDecimal> entry : getProducts().entrySet()) {
            res = res.concat(entry.getKey() + ": $" + entry.getValue() + "\n");
        }
        return res;
    }
}
