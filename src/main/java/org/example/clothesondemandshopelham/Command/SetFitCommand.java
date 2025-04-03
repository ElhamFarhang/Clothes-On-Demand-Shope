package org.example.clothesondemandshopelham.Command;

import org.example.clothesondemandshopelham.ProductBuilder.Pants;
import org.example.clothesondemandshopelham.ProductBuilder.Product;

public class SetFitCommand implements Command{
    private String fit;

    public SetFitCommand(String fit) {
        this.fit = fit;
    }

    @Override
    public void design(Product product) {
        if (product instanceof Pants)
            ((Pants) product).setFit(fit);
        System.out.println(product);
    }
}
