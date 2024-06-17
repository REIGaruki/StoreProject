package pro.sky.store;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class Catalogue {
    private static ArrayList<Product> goods = new ArrayList<Product>(Arrays.asList(
            new Product("Apple"),
            new Product("Orange"),
            new Product("Lemon"),
            new Product("Kiwi"),
            new Product("Mango"),
            new Product("Pear")
    ));


    public static ArrayList<Product> getGoods() {
        return goods;
    }
}
