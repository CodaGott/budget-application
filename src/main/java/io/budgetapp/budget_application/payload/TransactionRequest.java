package io.budgetapp.budget_application.payload;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TransactionRequest {
    private Long id;
    private LocalDateTime transactionDate;
    private BigDecimal total;
    private String transactType;
    private String note;
}
