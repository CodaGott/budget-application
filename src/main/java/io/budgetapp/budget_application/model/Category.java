package io.budgetapp.budget_application.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Group group;
    private String categoryName;
    private BigDecimal budget;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
