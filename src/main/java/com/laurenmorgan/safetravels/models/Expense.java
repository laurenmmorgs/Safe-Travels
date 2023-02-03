package com.laurenmorgan.safetravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



@Entity 
@Table(name="expenses")
public class Expense {
	
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  
	  @NotNull
	  @Size(min = 5, max = 200)
	  private String expense;


	   @NotNull
	   @Size(min = 5, max = 200)
	   private String vendor;


	  @NotNull
	  @Size(min = 3, max = 40)
	  private int amount;


	   // This will not allow the createdAt column to be updated after creation
	  @Column(updatable=false)
	  @DateTimeFormat(pattern="yyyy-MM-dd")
	  private Date createdAt;
	  @DateTimeFormat(pattern="yyyy-MM-dd")
	  private Date updatedAt;
	
	  
	  public Expense() {
		
	}
	  
	  


	public Expense(
			String expense,  
			String vendor,
			int amount) {
		this.expense = expense;
		this.vendor = vendor;
		this.amount = amount;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getExpense() {
		return expense;
	}


	public void setExpense(String expense) {
		this.expense = expense;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }



	  

}
