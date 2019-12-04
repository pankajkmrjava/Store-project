package com.pankaj.store.policy;

/**
 * 
 * @author pankaj.kumar
 *
 */
public class ThresholdDiscount implements DiscountPolicy {

	public double applyDiscount(double totalAmount) {
		
		if (totalAmount < 100) {
			return totalAmount;
		}
		
		int discountFactor = (int) totalAmount / 100;
		double discount = discountFactor * 5;
		return totalAmount - discount; 
	}

}
