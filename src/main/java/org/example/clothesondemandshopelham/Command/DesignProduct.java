package org.example.clothesondemandshopelham.Command;

import org.example.clothesondemandshopelham.ProductBuilder.Product;

import java.util.ArrayList;
import java.util.List;

public class DesignProduct {
    private List<Command> pipeline = new ArrayList<>();

    public void addCommand(Command command){
        pipeline.add(command);
    }

    public Product execute(Product product){
        for(Command command : pipeline){
            command.design(product);
        }
        return product;
    }

    public void clear() {
        pipeline.clear();
    }
}
