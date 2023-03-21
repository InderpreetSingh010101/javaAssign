package com.demo.service;

import com.demo.domain.Order;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderServiceTest {





    @Test
    //public static OrderService getInstance()

    public void test_getInstance(){
        OrderService order1 = OrderService.getInstance();
        assertTrue(order1 instanceof OrderService);
    }

    @Test
    public void test_PlaceOrder(){  // boolean placeOrder(Order order, String cc)

        Order order = new Order(1 , "Fridge" , 50000);
        assertTrue(OrderService.getInstance().placeOrder(order , "LG"));
    }
}
