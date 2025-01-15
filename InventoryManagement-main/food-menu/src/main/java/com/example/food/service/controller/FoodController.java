package com.example.food.service.controller;

import com.example.food.service.model.FoodModel;
import com.example.food.service.repository.FoodRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fooditems")
public class FoodController {

    private final FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @GetMapping("/getAll")
    public List<FoodModel> getAllFoodItems() {
        return foodRepository.findAll();
    }

    @PostMapping("/add")
    public FoodModel addFoodItem(@RequestBody FoodModel foodItem) {
        return foodRepository.save(foodItem);
    }

    @GetMapping("/{id}")
    public FoodModel getFoodItemById(@PathVariable Long id) {
        return foodRepository.findById(id).orElseThrow(() -> new RuntimeException("Food item not found"));
    }

    @GetMapping("/{id}/check-availability")
    public boolean checkFoodItemAvailability(@PathVariable Long id, @RequestParam int quantity) {
        FoodModel foodItem = foodRepository.findById(id).orElseThrow(() -> new RuntimeException("Food item not found"));
        return foodItem.getQuantity() >= quantity;
    }
}
