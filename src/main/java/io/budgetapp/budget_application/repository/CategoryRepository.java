package io.budgetapp.budget_application.repository;

import io.budgetapp.budget_application.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByCategoryName(String categoryName);
    List<Category> findCategoriesByGroup_Name(String name);
}
