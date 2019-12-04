package com.pankaj.store.service;

import com.pankaj.store.bean.Item;
import com.pankaj.store.bean.ItemType;


/**
 * 
 * @author pankaj.kumar
 *
 */
public class PricingPolicy implements Item {

    private final Item baseItem;

    public PricingPolicy(Item baseItem) {
        this.baseItem = baseItem;
    }

    public double getUnitPrice() { 
    	return baseItem.getUnitPrice();
    }

    public String getName() { 
    	return baseItem.getName(); 
    }
    
    public ItemType getType() {
    	return baseItem.getType(); 
    }

    public double priceForQuantity(int quantity) {
        return baseItem.priceForQuantity(quantity);
    }
}

