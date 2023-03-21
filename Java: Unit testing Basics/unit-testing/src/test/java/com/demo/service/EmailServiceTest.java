package com.demo.service;

import com.demo.domain.Order;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;


public class EmailServiceTest {

@BeforeClass                               // Should be static
public static void beforeclass(){
    System.out.println("Before Class Mthd");
}

    @Before
    public  void before(){
        System.out.println("Before Called Mthd");
    }

@Test
    public void getInstance_Test(){    //public EmailService() // public static EmailService getInstance()

        EmailService e1 = EmailService.getInstance();
        assertTrue(e1 instanceof EmailService);   //    __    instanceOf  ___
                                                 //  ^^ object         ^^ Class
         // order , string cc   sendEmail()
    }

    @Test
public void sendEmailTest(){
    Order order = new Order(1 , "Mobile" , 2000) ;

    assertTrue(EmailService.getInstance().sendEmail(order , "Samsung")); // order , string cc   sendEmail()
 }

@Test(expected = RuntimeException.class)
    public void sendEmailTestForException(){
        Order order = new Order(1 , "Mobile" , 2000) ;

        EmailService.getInstance().sendEmail(order); // order , string cc   sendEmail()
    }



    @After
    public void after()  {
        System.out.println("After is called");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("After class is called");
    }


}