package org.example.clothesondemandshopelham.OrderService;

import org.example.clothesondemandshopelham.OrderObserver.Customer;
import org.example.clothesondemandshopelham.OrderObserver.Order;

import javax.swing.*;

public class OrderService {
    private static OrderService instance;

    private OrderService() {
    }

    public static OrderService getInstance() {
        if (instance == null) {
            instance = new OrderService();
        }
        return instance;
    }

    public void sendOrder(Order order) {
        String customerName = order.getCustomer().getCustomerName();
        JOptionPane.showMessageDialog(null, "Dear "+ customerName + " your Order: "+ order.getId() + " is ready to deliver.");
    }

    public String sendReceipt (Order order, Customer customer){
        Receipt receipt = new Receipt(customer,order);
        return receipt.printReceipt();
    }
}
