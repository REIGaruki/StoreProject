package pro.sky.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;

@RestController
@RequestMapping(path="/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping(path="/add")
    public HashSet<Product> addToCart(@RequestParam(value = "ids") ArrayList<Integer> addedGoods) {
        return cartService.addToCart(addedGoods);
    }
    @GetMapping(path="/get")
    public HashSet<Product> viewCart() {
        return cartService.viewCart();
    }
}
