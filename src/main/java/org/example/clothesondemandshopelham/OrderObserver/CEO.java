package org.example.clothesondemandshopelham.OrderObserver;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CEO implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        JOptionPane.showMessageDialog(null, "CEO message:\nWe have received your order.\nThank you for your order.");
    }
}
