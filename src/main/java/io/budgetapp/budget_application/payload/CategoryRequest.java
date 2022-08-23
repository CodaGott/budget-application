package io.budgetapp.budget_application.payload;

import io.budgetapp.budget_application.model.Group;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class CategoryRequest {
    private Group group;
    private String categoryName;
    private BigDecimal budget;
    private LocalDate startDate;
    private LocalDate endDate;
}
