package io.budgetapp.budget_application.controller;

import io.budgetapp.budget_application.exceptions.CategoryException;
import io.budgetapp.budget_application.payload.CategoryRequest;
import io.budgetapp.budget_application.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<?> createABudget(@RequestBody CategoryRequest categoryRequest){
        try {
            return new ResponseEntity<>(categoryService.createCategory(categoryRequest), HttpStatus.OK);
        } catch (CategoryException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/budget/{name}")
    public ResponseEntity<?> getByName(@PathVariable String name){
        try {
            return new ResponseEntity<>(categoryService.getCategoryByName(name), HttpStatus.FOUND);
        }catch (CategoryException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}
