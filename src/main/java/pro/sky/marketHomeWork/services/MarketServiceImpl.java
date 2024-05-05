package pro.sky.marketHomeWork.services;

import org.springframework.stereotype.Service;
import pro.sky.marketHomeWork.domain.Basket;

import java.util.Map;

@Service
public class MarketServiceImpl implements MarketService{
    private final Basket basket;

    public MarketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addProduct(Integer id, String name) {
        basket.addProduct(id, name);
    }

    @Override
    public Map<Integer, String> getBasket() {
        return basket.getBasketMap();
    }
}
