package pro.sky.marketHomeWork.services;

import java.util.Map;

public interface MarketService {
    void addProduct(Integer id, String name);

    Map<Integer, String> getBasket();
}
