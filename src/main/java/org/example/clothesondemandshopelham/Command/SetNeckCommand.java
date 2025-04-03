package org.example.clothesondemandshopelham.Command;

import org.example.clothesondemandshopelham.ProductBuilder.Product;
import org.example.clothesondemandshopelham.ProductBuilder.TShirt;

public class SetNeckCommand implements Command{
    private String neck;

    public SetNeckCommand(String neck) {
        this.neck = neck;
    }

    @Override
    public void design(Product product) {
        if (product instanceof TShirt)
            ((TShirt) product).setNeck(neck);
        System.out.println(product);

    }
}
