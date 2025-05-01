package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;
@Entity
@ToString
@Data
public class Product {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long productId;
	    private String name;
	    private String color;
	    @ManyToOne
	    @JoinColumn(name = "category_id")
	    private Category category;
	    private double price;	
	    private Integer stockQuantity;
}
