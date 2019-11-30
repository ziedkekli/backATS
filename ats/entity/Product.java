package com.example.ats.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false) 
	private String color;
	
	@Column(nullable=false)
	private String category;
	
	@Column(nullable=false) 
	private String productName;
	
	@Column(nullable=false)
	private double price;
	
	@Column(nullable=false) 
	private String description;
	
	@Column(nullable=false)
	private String tag;
	
	@Column(nullable=false) 
	private String productMaterial;
	
	@Column(nullable=false)
	private String imageUrl;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date createdAt;
	
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Reviews> reciews;

}
