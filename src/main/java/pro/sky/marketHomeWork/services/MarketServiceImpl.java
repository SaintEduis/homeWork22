package pro.sky.marketHomeWork.services;

import org.springframework.stereotype.Service;
import pro.sky.marketHomeWork.domain.Basket;
import pro.sky.marketHomeWork.exceptions.BasketIsEmptyException;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService{
    private final Basket basket;

    public MarketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addProduct(List<Integer> id) {
        basket.addProduct(id);
    }

    @Override
    public List<Integer> getBasket() {
        if (!(basket.getBasketList().isEmpty())) {
            return basket.getBasketList();
        }
        else {
            throw new BasketIsEmptyException();
        }
    }
}
