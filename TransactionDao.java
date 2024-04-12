package com.transaction.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.demo.model.Transaction;


@Repository
public interface TransactionDao extends JpaRepository<Transaction, Long>{

}
