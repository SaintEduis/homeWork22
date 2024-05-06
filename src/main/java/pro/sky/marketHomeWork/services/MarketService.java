package pro.sky.marketHomeWork.services;

import java.util.List;

public interface MarketService {
//    void addProduct(Integer id);

    void addProduct(List<Integer> id);

    List<Integer> getBasket();
}
