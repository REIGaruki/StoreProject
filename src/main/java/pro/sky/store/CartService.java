package pro.sky.store;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public interface CartService {
    HashSet<Product> addToCart(ArrayList<Integer> addedGoods);

    HashSet<Product> viewCart();

}
