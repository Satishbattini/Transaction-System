package com.transaction.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.demo.dao.TransactionDao;
import com.transaction.demo.model.Transaction;

@Service
public class TransactionService {
	
@Autowired
TransactionDao dao;

public String createTransaction(Transaction t) {
	dao.save(t);
	return "transaaction successful";
}

public List<Transaction> getTransaction() {
	
	return dao.findAll();
}

public Transaction updateTransactionbyid(Long id, Transaction t) {
	t.setId(id);
	return dao.save(t);
}

public String deleteTransactionbyid(Long id) {
	dao.deleteById(id);
	return "delete successfully";
}


}
