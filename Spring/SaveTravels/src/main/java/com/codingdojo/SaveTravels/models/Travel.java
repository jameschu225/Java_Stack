package com.codingdojo.SaveTravels.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="travels")
public class Travel {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		
		@NotBlank
		@Size(min=5, message="name has longer than 5 char")
		private String expenseName;
		
		@NotBlank
		@Size(min=5, message="name has longer than 5 char")
		private String venderName;
		
		@NotNull
		@Min(value= 0, message= "has greater than 0")
		private Double amount;
		
		@NotBlank
		@Size(min=5 , message="has longer than 5 char")
		@Column(columnDefinition="TEXT")
		private String description;
		
		@Column(updatable = false)
		@DateTimeFormat(pattern="yyy_MM-dd")
		private Date createdAt;
		
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public Travel() {	
	    }
	    
	    public Travel(String expenseName, String venderName, Double amount, String description) {
	    	this.expenseName = expenseName;
	    	this.venderName = venderName;
	    	this.amount = amount;
	    	this.description = description;
	    }
	    
	    @PrePersist
	    protected void onCreate() {
	    	this.createdAt = new Date();	    	
	    }
	    
	    @PreUpdate
	    protected void onUpdate() {
	    	this.updatedAt = new Date();
	    }

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getExpenseName() {
			return expenseName;
		}

		public void setExpenseName(String expenseName) {
			this.expenseName = expenseName;
		}

		public String getVenderName() {
			return venderName;
		}

		public void setVenderName(String venderName) {
			this.venderName = venderName;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
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

}
