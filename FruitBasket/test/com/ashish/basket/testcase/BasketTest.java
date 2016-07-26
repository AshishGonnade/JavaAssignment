package com.ashish.basket.testcase;

import junit.framework.Assert;
import org.junit.Test;

import com.ashish.basket.businessObj.Basket;
import com.ashish.basket.domain.Item;
import com.ashish.basket.service.BasketService;
import com.ashish.basket.serviceImpl.BasketServiceImpl;

/**
 * 
 * @author Ashish Gonnade
 *
 */
public class BasketTest {

	/**
	 * Test case to check the Basket is empty
	 */
	@Test
	public void testBasketEmpty() {
		Basket cart = new Basket();
		Assert.assertEquals(0, cart.getItemCount());
	}

	/**
	 * Test case to add one item to Basket
	 */
	@Test
	public void testAddOneItemToBasket() {
		Basket cart = new Basket();
		Item fItemObj = new Item("Banana", 50, 5.0);
		cart.addFruitItem(fItemObj);
		Assert.assertEquals(1, cart.getItemCount());
		Assert.assertEquals(250.0, cart.getTotalBasketValue());
	}

	/**
	 * Test case to add multiple item to Basket Added 5 items as mentioned
	 * in the problem statement
	 */
	@Test
	public void testAddMultipleItemsToBasket() {
		
		/*Below dummy data is shifted to BasketServiceImpl class.
		 * //Dummy data for fruits i.e. items has been added to the basket having name, quantity and cost 
		Item bananaObj = new Item("Bananas", 2, 5.0);
		Item orangeObj = new Item("Oranges", 2, 10.0);
		Item appleObj = new Item("Apples", 1, 25.50);
		Item lemonObj = new Item("Lemons", 1, 3.0);
		Item peachObj = new Item("Peaches", 3, 30.0);

		basket.addFruitItem(bananaObj);
		basket.addFruitItem(orangeObj);
		basket.addFruitItem(appleObj);
		basket.addFruitItem(lemonObj);
		basket.addFruitItem(peachObj);*/
		
		
		BasketServiceImpl impl = new BasketServiceImpl();
		Assert.assertEquals(5, impl.addItem().getItemCount());
		Assert.assertEquals(198.50, impl.addItem().getTotalBasketValue());

	}
}
