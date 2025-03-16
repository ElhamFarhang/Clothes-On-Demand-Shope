package org.example.clothesondemandshopelham.OrderObserver;

public class Customer {

    private int customerId;
    private String customerName;
    private String address;
    private String email;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String address, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "customerId: " + customerId +"\n"+
                "customerName: " + customerName  +"\n"+
                "address: " + address  +"\n"+
                "email: " + email;
    }
}
