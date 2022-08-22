package io.budgetapp.budget_application.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {
    // Todo : : : > > Transactions are incomes and this will help in
    //  monitoring the spending. When I transaction gets created, then
    //  we can keep reducing money from the transaction to show the remain balance for the month.
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime transactionDate;
    private BigDecimal total;
    private String transactType;
    private String note;
    @ManyToOne
    private Category category;
}
