package bdn.helloworld.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import bdn.helloworld.model.Transaction;

@Service("transactionService")
public class TransactionServiceImpl implements TransactionService {

	/* (non-Javadoc)
	 * @see bdn.helloworld.service.TransactionService#findAllTransactions()
	 */
	@Override
	public List<Transaction> findAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();

		Transaction t1 = new Transaction();
		t1.setShareQty(5);
		transactions.add(t1);

		Transaction t2 = new Transaction();
		t2.setShareQty(120);
		transactions.add(t2);

		Transaction t3 = new Transaction();
		t3.setShareQty(11);
		transactions.add(t3);

		Transaction t4 = new Transaction();
		t4.setShareQty(532);
		transactions.add(t4);

		return transactions;
	}

}
