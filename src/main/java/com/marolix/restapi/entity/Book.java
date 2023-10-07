package com.marolix.restapi.entity;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

	
private Integer id;
	
	private String name;
	
	private Double price;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Book(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
