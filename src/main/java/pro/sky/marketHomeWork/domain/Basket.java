package pro.sky.marketHomeWork.domain;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class Basket {
    private final Map<Integer, String> basketMap;

    public Basket() {
        this.basketMap = new HashMap<>();
    }

    public void addProduct(Integer id, String name) {
        basketMap.put(id, name);
    }

    public Map<Integer, String> getBasketMap() {
        return basketMap;
    }
}
