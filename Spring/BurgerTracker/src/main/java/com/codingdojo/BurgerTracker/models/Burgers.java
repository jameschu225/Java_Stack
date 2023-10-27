package com.codingdojo.BurgerTracker.models;

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
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="burgers")
public class Burgers {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		
		@NotBlank
		@Size(min=5, message="name has longer than 5 char")
		private String burgerName;
		
		@NotBlank
		@Size(min=5, message="name has longer than 5 char")
		private String restaurantName;
		
		@NotNull
		@Min(1)
		@Max(5)
		private Integer numberOfRate;
		
		@NotBlank
		@Size(min=5 , message="has longer than 5 char")
		@Column(columnDefinition="TEXT")
		private String note;
		
		@Column(updatable = false)
		@DateTimeFormat(pattern="yyy_MM-dd")
		private Date createdAt;
		
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public Burgers() {	
	    }
	    
	    public Burgers(String burgerName, String restaurantName, Integer numberOfRate, String note) {
	    	this.burgerName = burgerName;
	    	this.restaurantName = restaurantName;
	    	this.numberOfRate = numberOfRate;
	    	this.note = note;
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

		public String getBurgerName() {
			return burgerName;
		}

		public void setBurgerName(String burgerName) {
			this.burgerName = burgerName;
		}

		public String getRestaurantName() {
			return restaurantName;
		}

		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}

		public Integer getNumberOfRate() {
			return numberOfRate;
		}

		public void setNumberOfRate(Integer numberOfRate) {
			this.numberOfRate = numberOfRate;
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

		public String getNote() {
			return note;
		}

		public void setNote(String note) {
			this.note = note;
		}
	    

}
