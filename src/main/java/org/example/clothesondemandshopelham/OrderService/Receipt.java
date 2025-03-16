package org.example.clothesondemandshopelham.OrderService;

import org.example.clothesondemandshopelham.OrderObserver.Customer;
import org.example.clothesondemandshopelham.OrderObserver.Order;
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

    public String printReceipt(){
        String orderStr="";
        for (Product product: order.getProducts()) {
            orderStr= orderStr + "\n" +product.toString();
        }
        String receiptStr= "Receipt:\nOrderId: "+ order.getId() +"\n"+ customer.toString() +"\n"+ orderStr +"\nTotal price: " + getTotalPrice();
        return receiptStr;
    }
}
