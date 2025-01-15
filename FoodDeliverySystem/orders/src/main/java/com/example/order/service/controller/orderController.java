package com.example.order.service.controller;

import com.example.order.service.model.orderModel;
import com.example.order.service.repository.orderRepository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class orderController {

    private final orderRepository orderRepository;
    private final FoodItemServiceClient foodItemServiceClient;

    public orderController(orderRepository orderRepository, FoodItemServiceClient foodItemServiceClient) {
        this.orderRepository = orderRepository;
        this.foodItemServiceClient = foodItemServiceClient;
    }

    @GetMapping("/getAll")
    public List<orderModel> getAllOrders() {
        return orderRepository.findAll();
    }

    @PostMapping("/place")
    public orderModel placeOrder(@RequestBody orderModel order) {
        // Check food item availability
        boolean isAvailable = foodItemServiceClient.checkFoodItemAvailability(order.getFoodItemId(), order.getQuantity());

        if (!isAvailable) {
            throw new RuntimeException("Food item not available in sufficient quantity");
        }
        // Save the order
        return orderRepository.save(order);
    }

    @FeignClient(name = "food-menu")
    public interface FoodItemServiceClient {
        @GetMapping("/fooditems/{id}/check-availability")
        boolean checkFoodItemAvailability(@PathVariable("id") Long foodItemId, @RequestParam("quantity") int quantity);
    }
}
