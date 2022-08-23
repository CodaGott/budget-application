package io.budgetapp.budget_application.services;


import io.budgetapp.budget_application.model.Transaction;
import io.budgetapp.budget_application.payload.TransactionRequest;

public interface TransactionService {

    Transaction createTransaction(TransactionRequest transactionRequest);
    Transaction updateTransaction(TransactionRequest transactionRequest);
    Void deleteTransaction(Long id);
    Transaction getTransactionBalance();
}
