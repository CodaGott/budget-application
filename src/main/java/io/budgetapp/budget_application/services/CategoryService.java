package io.budgetapp.budget_application.services;

import io.budgetapp.budget_application.model.Category;
import io.budgetapp.budget_application.payload.CategoryRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface CategoryService {
    Category createCategory(CategoryRequest categoryRequest);
    List<Category> getCategoryByName(String name);
    List<Category> getCategoryByStartDate(LocalDateTime localDateTime);
    List<Category> getCategoryByEndDate(LocalDateTime localDateTime);
    void deleteACategoryById(Long categoryId);
    Category updateCategory(CategoryRequest categoryRequest);
}
