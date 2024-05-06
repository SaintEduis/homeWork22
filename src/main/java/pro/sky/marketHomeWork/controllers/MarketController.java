package pro.sky.marketHomeWork.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.marketHomeWork.exceptions.BasketIsEmptyException;
import pro.sky.marketHomeWork.services.MarketService;

import java.util.List;

@RestController
@RequestMapping("/market")
public class MarketController {
    private final MarketService marketService;

    public MarketController(MarketService marketService) {
        this.marketService = marketService;
    }

   /* @GetMapping(path = "/add")
    public String addProduct(@RequestParam("id") Integer id) {
            marketService.addProduct(id);
            return "Продукт добавлен!";
    }*/

    @GetMapping(path = "/add")
    public String addProduct(@RequestParam("id") List<Integer> id) {
        marketService.addProduct(id);
        return "Продукт добавлен!";
    }

    @GetMapping(path = "/get")
    public List<Integer> getBasket() {
        try {
            return marketService.getBasket();
        }
        catch (BasketIsEmptyException e) {
            System.out.println("Корзина пуста!");
            throw new BasketIsEmptyException();
        }
    }
}
