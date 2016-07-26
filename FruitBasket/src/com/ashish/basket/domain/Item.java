package com.ashish.basket.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Ashish Gonnade
 * POJO class
 */
public class Item implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int quantity;
	private double cost;
	
	public Item(String name, int quantity, double cost){
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
