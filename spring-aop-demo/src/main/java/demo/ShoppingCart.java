package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {


    public void checkout(String status){
        System.out.println("Checkout method from Shopping Cart is called!");
    }

    public int quantity(){
        return  69;
    }

}
