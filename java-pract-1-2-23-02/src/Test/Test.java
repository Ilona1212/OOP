/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;
import Main.Order;
/**
 *
 * @author 38099
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order(1, "apple", "Vasya");
        System.out.println(order);
        order.dateTime = "23 лютого 2021" ;
        Type type = Type.rushOrder;
        System.out.println(type);
    }
    
}

