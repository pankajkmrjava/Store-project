package com.pankaj.store;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.pankaj.store.bean.Cart;
import com.pankaj.store.bean.Item;
import com.pankaj.store.bean.ItemType;
import com.pankaj.store.bean.Product;
import com.pankaj.store.bean.User;
import com.pankaj.store.bean.UserType;

/**
 * 
 * @author pankaj.kumar
 *
 */
public class TestWithoutDiscounts {

    private Cart cart;
    private Item item;

    @Before
    public void setUp() {
    	User user = new User(UserType.SIMPLE, "John");
        cart = new Cart(user);
        item = new Product("something", 1000, ItemType.OTHER);
    }

    @Test
    public void test_emptyCartCostsZero() {
        assertEquals(0, cart.total(), 0.01);
    }

    @Test
    public void test_singleBasicItemCostsItsUnitPrice() {
        cart.add(item);
        assertEquals(item.getUnitPrice(), cart.total(), 0.01);
    }

    @Test
    public void test_multipleBasicItemsCostProportionally() {
        int howMany = 3;
        cart.add(item, howMany);
        assertEquals(howMany * item.getUnitPrice(), cart.total(), 0.01);
    }

    @Test
    public void test_separatelyAdding() {
        int howMany = 3;
        for (int i = howMany; i > 0; i--) {
            cart.add(item);
        }
        assertEquals(howMany * item.getUnitPrice(), cart.total(), 0.01);
    }
}
