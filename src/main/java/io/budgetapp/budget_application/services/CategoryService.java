package io.budgetapp.budget_application.services;

import io.budgetapp.budget_application.exceptions.CategoryException;
import io.budgetapp.budget_application.model.Category;
import io.budgetapp.budget_application.payload.CategoryRequest;

import java.time.LocalDateTime;
import java.util.List;


public interface CategoryService {
    Category createCategory(CategoryRequest categoryRequest) throws CategoryException;
    Category getCategoryByName(String name) throws CategoryException;
    List<Category> getCategoryByStartDate(LocalDateTime localDateTime);
    List<Category> getCategoryByEndDate(LocalDateTime localDateTime);
    List<Category> getCategoryByGroupName(String groupName) throws CategoryException;
    void deleteACategoryById(Long categoryId) throws CategoryException;
    Category updateCategory(CategoryRequest categoryRequest, Long id) throws CategoryException;
}
