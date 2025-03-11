package org.example.clothesondemandshopelham.Command;

import org.example.clothesondemandshopelham.ProductBuilder.Pants;

public class DesignPants implements Command{
    private Pants product;
    public DesignPants(Pants product){
        this.product = product;
    }

    @Override
    public String  designProduct() {
        return product.decorate();
    }
}
