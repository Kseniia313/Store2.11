package sky.pro.Store.Service;

import org.springframework.stereotype.Service;
import sky.pro.Store.Repository.Cart;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(List<Long> items) {
        items.forEach(item -> cart.add(item));
    }

    @Override
    public List<Long> get() {
        return cart.get();
    }
}
