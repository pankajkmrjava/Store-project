package com.pankaj.store.bean;

/**
 * 
 * @author pankaj.kumar
 *
 */
public interface Item {
	double getUnitPrice();

	double priceForQuantity(int quantity);

	String getName();

	ItemType getType();
}
