package io.budgetapp.budget_application.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime transactionDate;
    private BigDecimal total;
    private String transactType;
    private String note;
    @ManyToOne
    private Category category;
}
