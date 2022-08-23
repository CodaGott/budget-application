package io.budgetapp.budget_application.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Category {
    // TODO : : : > > This is the main budget.
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Group group;
    private String categoryName;
    private BigDecimal budget;
    private LocalDate startDate;
    private LocalDate endDate;
}
