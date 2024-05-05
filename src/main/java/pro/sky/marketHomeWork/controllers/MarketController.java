package pro.sky.marketHomeWork.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.marketHomeWork.services.MarketService;

import java.util.Map;

@RestController
@RequestMapping("/market")
public class MarketController {
    private final MarketService marketService;

    public MarketController(MarketService marketService) {
        this.marketService = marketService;
    }

    @GetMapping(path = "/add")
    public String addProduct(@RequestParam("id") Integer id,
                             @RequestParam("name") String name) {
        marketService.addProduct(id, name);
        return "Сотрудник добавлен!";
    }

    @GetMapping(path = "/get")
    public Map<Integer, String> getBasket() {
        return marketService.getBasket();
    }
}
