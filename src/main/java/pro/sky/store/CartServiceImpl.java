package pro.sky.store;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    @Override
    public ArrayList<Product> addToCart(List<Integer> addedGoods) {
        return new ArrayList<Product>();
    }
    @Override
    public HashSet<Product> viewCart() {
        return new HashSet<Product>();
    }
}
