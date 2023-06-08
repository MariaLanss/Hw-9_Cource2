package pro.sky.hw9_cource2;

import java.util.List;

public interface CartService {
    void addToCart(Integer itemId);

    void addToCart(int[] itemId);

    List<Integer> getCart();
}