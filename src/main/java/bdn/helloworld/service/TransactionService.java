package bdn.helloworld.service;

import java.util.List;

import bdn.helloworld.model.Transaction;

public interface TransactionService {

	List<Transaction> findAllTransactions();

}