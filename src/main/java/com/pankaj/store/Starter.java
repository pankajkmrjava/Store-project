package com.pankaj.store;

import com.pankaj.store.bean.Cart;
import com.pankaj.store.bean.Item;
import com.pankaj.store.bean.ItemType;
import com.pankaj.store.bean.Product;
import com.pankaj.store.bean.User;
import com.pankaj.store.bean.UserType;
import com.pankaj.store.policy.DiscountPolicy;
import com.pankaj.store.policy.ThresholdDiscount;
/**
 * 
 * @author pankaj.kumar
 *
 */
class Starter {
    public static void main (String[] args)
    {
    	User employee = new User(UserType.EMPLOYEE, "pankaj");
        Item groceryItem = new Product("Rice", 20, ItemType.GROCERY);
        Item otherItem = new Product("TV", 222, ItemType.OTHER);
        DiscountPolicy discountPolicy = new ThresholdDiscount();
        
        Cart cart = new Cart(employee, discountPolicy);
        cart.add(groceryItem, 4);
        cart.add(otherItem, 4);
        System.out.println(cart.total());        
    }
}