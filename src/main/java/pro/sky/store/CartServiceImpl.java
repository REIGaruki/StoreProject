package pro.sky.store;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
@SessionScope
public class CartServiceImpl implements CartService{
    Cart cart = new Cart();
    @Override
    public ArrayList<Integer> addToCart(ArrayList<Integer> addedGoods) {
        ArrayList<Product> goods = Catalogue.getGoods();
        for (Integer i : addedGoods) {
            for (int j = 0; j < goods.size(); j++) {
                if (i == j) {
                    goods.get(i).setQuantity(goods.get(i).getQuantity() + 1);
                    cart.goodsInCart.add(goods.get(i));
                }
            }
        }
        return addedGoods;
    }
    @Override
    public HashSet<Product> viewCart() {
        return cart.goodsInCart;
    }
}
