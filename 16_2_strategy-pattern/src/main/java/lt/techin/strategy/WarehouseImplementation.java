package lt.techin.strategy;

import java.util.ArrayList;
import java.util.List;

public class WarehouseImplementation implements Warehouse {

    List<Product> shopStock;

    public WarehouseImplementation() {
        this.shopStock = new ArrayList<>();
    }

    @Override
    public void addProducts(List<Product> products) {
        shopStock.addAll(products);
    }

    @Override
    public int getNumberOfProducts() {
        return shopStock.size();
    }

    @Override
    public List<Product> executeFilteringStrategy(FilteringStrategy strategy) {
        List<Product> strategyList = new ArrayList<>();

        for (Product product : shopStock) {
            if (strategy.filter(product)) {
                strategyList.add(product);
            }
        }

        //shopStock.forEach(p -> strategy.filter(p));

        return strategyList;
    }

    public void printFilteredProductList(List<Product> list) {

        list.forEach(System.out::println);

    }


}
