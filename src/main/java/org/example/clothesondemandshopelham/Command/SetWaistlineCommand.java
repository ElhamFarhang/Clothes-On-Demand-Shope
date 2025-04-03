package org.example.clothesondemandshopelham.Command;

import org.example.clothesondemandshopelham.ProductBuilder.Product;
import org.example.clothesondemandshopelham.ProductBuilder.Skirt;

public class SetWaistlineCommand implements Command{
    private String waistline;

    public SetWaistlineCommand(String waistline) {
        this.waistline = waistline;
    }

    @Override
    public void design(Product product) {
        if (product instanceof Skirt)
            ((Skirt) product).setWaistline(waistline);
        System.out.println(product);

    }
}
