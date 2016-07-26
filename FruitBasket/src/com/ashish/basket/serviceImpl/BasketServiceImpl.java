package com.ashish.basket.serviceImpl;

import com.ashish.basket.businessObj.Basket;
import com.ashish.basket.domain.Item;
import com.ashish.basket.service.BasketService;

public class BasketServiceImpl implements BasketService{

	@Override
	public Basket addItem() {
		Basket basket = new Basket();
		
		//Dummy data for fruits i.e. items has been added to the basket having name, quantity and cost. 
		//change the quantity and price, you will get the accurate result.
		Item bananaObj = new Item("Bananas", 2, 5.0);
		Item orangeObj = new Item("Oranges", 2, 20.0);
		Item appleObj = new Item("Apples", 1, 25.50);
		Item lemonObj = new Item("Lemons", 1, 3.0);
		Item peachObj = new Item("Peaches", 4, 30.0);

		basket.addFruitItem(bananaObj);
		basket.addFruitItem(orangeObj);
		basket.addFruitItem(appleObj);
		basket.addFruitItem(lemonObj);
		basket.addFruitItem(peachObj);
		
		return basket;
	}

}
