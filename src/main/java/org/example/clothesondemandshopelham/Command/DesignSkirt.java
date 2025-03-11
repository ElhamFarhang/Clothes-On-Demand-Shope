package org.example.clothesondemandshopelham.Command;

import org.example.clothesondemandshopelham.ProductBuilder.Skirt;

public class DesignSkirt implements Command {
    private Skirt product;
    public DesignSkirt(Skirt product){
        this.product = product;
    }

    @Override
    public String designProduct() {
        return product.decorate();
    }
}
