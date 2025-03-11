package org.example.clothesondemandshopelham.Command;

import org.example.clothesondemandshopelham.ProductBuilder.TShirt;

public class DesignTShirt implements Command {
    private TShirt product;
    public DesignTShirt(TShirt product){
        this.product = product;
    }
    @Override
    public String  designProduct() {
        return product.decorate();
    }
}
