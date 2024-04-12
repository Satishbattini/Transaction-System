package com.transaction.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.transaction.demo.model.Transaction;
import com.transaction.demo.service.TransactionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class TransactionController {

	@Autowired
	TransactionService service;
	@PostMapping("/postTransaction")
	public String postTransaction(@RequestBody Transaction t) {
		//TODO: process POST request
		
		return service.createTransaction(t);
	}
	@GetMapping("/getTransaction")
	public List<Transaction> getTransaction() {
		
		return service.getTransaction() ;
	}
	@PutMapping("/putTransaction/{id}")
	public Transaction putTransaction(@PathVariable Long id, @RequestBody Transaction t) {
		
		
		return service.updateTransactionbyid(id,t) ;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteTransaction(@PathVariable Long id) {
		
		return service.deleteTransactionbyid(id);
		
	}
}
