package pro.sky.marketHomeWork.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final ArrayList<Integer> basketList;

    public Basket() {
        this.basketList = new ArrayList<Integer>();
    }

    /*public void addProduct(Integer id) {
        basketList.add(id);
    }*/

    public void addProduct(List<Integer> id) {
        basketList.addAll(id);
    }

    public List<Integer> getBasketList() {
        return basketList;
    }
}
