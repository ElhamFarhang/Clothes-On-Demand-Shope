package org.example.clothesondemandshopelham.OrderObserver;

import org.example.clothesondemandshopelham.ProductBuilder.Product;

public class Receipt {

    private Customer customer;
    private Order order;
    private double totalPrice = 0;

    public Receipt(Customer customer, Order order) {
        this.customer = customer;
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalPrice() {
        for (Product p: order.getProducts()){
            totalPrice = totalPrice + p.getPrice();
        }
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void printReceipt(){
        System.out.println("Receipt:");
        System.out.println(customer.toString());
        System.out.println("Order:"+order.getId());
        for (Product product: order.getProducts()) {
            System.out.println(product.toString());
        }
        System.out.println("Total price: " + getTotalPrice());
    }
}
