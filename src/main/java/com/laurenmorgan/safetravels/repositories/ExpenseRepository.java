package com.laurenmorgan.safetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laurenmorgan.safetravels.models.Expense;


@Repository 
public interface ExpenseRepository  extends CrudRepository<Expense, Long>{
	
	
	List<Expense> findall();

}
