package pro.sky.marketHomeWork.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
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

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<String> handleTypeMismatch(MethodArgumentTypeMismatchException e) {
        String error = "Неверный тип введённых данных!";
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

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
