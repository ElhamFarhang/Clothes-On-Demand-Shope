package org.example.clothesondemandshopelham.Command;

import org.example.clothesondemandshopelham.ProductBuilder.Product;
import org.example.clothesondemandshopelham.ProductBuilder.TShirt;

public class SetSleevesCommand implements Command{
    private String sleeves;

    public SetSleevesCommand(String sleeves) {
        this.sleeves = sleeves;
    }

    @Override
    public void design(Product product) {
        if (product instanceof TShirt)
            ((TShirt) product).setSleeves(sleeves);
        System.out.println(product);

    }
}
