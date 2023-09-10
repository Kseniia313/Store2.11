package sky.pro.Store.Controller;

import org.springframework.web.bind.annotation.*;
import sky.pro.Store.Service.CartService;

import java.util.List;

@RestController
@RequestMapping("/order")

public class ControllerCart {
    private final CartService cartService;

    public ControllerCart(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/add")
    public String get(@RequestParam List<Long> items) {
        cartService.add(items);
        return " Товары " + items + " добавлены в корзину ";
    }

    @GetMapping("/get")
    public List<Long> get() {
        return cartService.get();
    }
}
