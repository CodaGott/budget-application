package io.budgetapp.budget_application.payload;

import io.budgetapp.budget_application.model.Group;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CategoryRequest {
    private Group group;
    private String categoryName;
    private BigDecimal budget;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
