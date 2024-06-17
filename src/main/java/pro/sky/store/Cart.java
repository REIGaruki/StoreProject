package pro.sky.store;

import java.util.HashSet;
import java.util.Set;

public class Cart {
    private HashSet<Product> goodsInCart = new HashSet<Product>();

    public Cart(HashSet<Product> goodsInCart) {
        this.goodsInCart = goodsInCart;
    }
}
