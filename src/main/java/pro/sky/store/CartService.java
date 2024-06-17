package pro.sky.store;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public interface CartService {
    ArrayList<Product> addToCart(List<Integer> addedGoods);

    HashSet<Product> viewCart();

}
