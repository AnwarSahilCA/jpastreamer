package com.example.demo.resource;

import javax.persistence.Entity;

import lombok.Data;

import java.math.BigDecimal;

import javax.persistence.*;
@Data
@Entity
public class Product {
	@Id
	@GeneratedValue
	private long Id;
	private String name;
	private String description;
	private BigDecimal price;
	

}
