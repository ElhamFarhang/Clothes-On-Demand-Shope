package org.example.clothesondemandshopelham.Command;

import org.example.clothesondemandshopelham.ProductBuilder.Product;
import org.example.clothesondemandshopelham.ProductBuilder.Skirt;

public class SetPatternCommand implements Command{
    private String pattern;

    public SetPatternCommand(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public void design(Product product) {
        if (product instanceof Skirt)
            ((Skirt) product).setPattern(pattern);
    }
}
