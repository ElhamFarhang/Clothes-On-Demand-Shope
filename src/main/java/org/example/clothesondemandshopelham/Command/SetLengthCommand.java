package org.example.clothesondemandshopelham.Command;

import org.example.clothesondemandshopelham.ProductBuilder.Pants;
import org.example.clothesondemandshopelham.ProductBuilder.Product;

public class SetLengthCommand implements Command{
    private String length;

    public SetLengthCommand(String length) {
        this.length = length;
    }

    @Override
    public void design(Product product) {
        if (product instanceof Pants)
            ((Pants) product).setLength(length);
    }
}
