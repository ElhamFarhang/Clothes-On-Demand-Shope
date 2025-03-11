package org.example.clothesondemandshopelham.OrderObserver;

import org.example.clothesondemandshopelham.ProductBuilder.Product;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<Product> products;
    private PropertyChangeSupport propertyChangeSupport= new PropertyChangeSupport(this);

    public Order() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public Order(int id, Customer customer, List<Product> products) {
        this.id = id;
        this.customer = customer;
        this.products = products;
          }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;

    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        List<Product> oldProducts= this.products;
        this.products = products;
        propertyChangeSupport.firePropertyChange("order",oldProducts,this.products);
    }

    @Override
    public String toString() {
        return "Order: " +
                "orderId=" + id +
                " " +customer +
                ", products=" + products ;
    }
}
