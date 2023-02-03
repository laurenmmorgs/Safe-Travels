package com.laurenmorgan.safetravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laurenmorgan.safetravels.models.Expense;
import com.laurenmorgan.safetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	public List<Expense> allExpenses(){
		return expenseRepository.findAll();
	}
	
	   public Expense createExpense(Expense e) {
	        return expenseRepository.save(e);
	    }
}
