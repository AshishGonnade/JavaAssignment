package com.ashish.basket.businessObj;

import java.util.ArrayList;
import java.util.List;
import com.ashish.basket.domain.Item;
import com.ashish.basket.serviceImpl.BasketServiceImpl;

/**
 * 
 * @author Ashish Gonnade
 *
 */
public class Basket {
	
	private List<Item> itemList = new ArrayList<Item>();
	private double totalFruitCartPrice = 0.0;
	
	/**
	 * to get the number of items i.e if we add banana will return 1; if add banana and oranges then 2
	 * @return
	 */
	public int getItemCount(){
		return itemList.size();
	}
	

	/**
	 * method to add fruits 
	 * @param fruitItem
	 */
	public void addFruitItem(Item fruitItem){
		itemList.add(fruitItem);
	}
	
	/**
	 * method to calculate the total cost of item based on quantity
	 * @return
	 */
	public double getTotalBasketValue(){
		if(null != itemList && itemList.size()>0){
			System.out.println("----------------------------------------------------------------------");
			for (Item fItem : itemList) {
				System.out.println(fItem.getQuantity()+" Nos. of "+fItem.getName()+" added to the basket for each unit price of "+fItem.getCost());
				totalFruitCartPrice = totalFruitCartPrice + (fItem.getQuantity()*fItem.getCost());
			}
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Total Cost of the Items added above to the basket is Rs."+totalFruitCartPrice);
			System.out.println("----------------------------------------------------------------------");
		}
		return totalFruitCartPrice;
	}
	
	/**
	 * static main method to get the total cost
	 * @param args
	 */
	public static void main(String[] args) {
		BasketServiceImpl basketObj = new BasketServiceImpl();
		basketObj.addItem().getTotalBasketValue();
		
	}
}
