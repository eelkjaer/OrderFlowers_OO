package model;

import java.util.ArrayList;

public class Controller {
    private ArrayList<Order> orders = new ArrayList<>();

    public void runApplication(){
        createOrder();
        printOrders();

    }

    private void createOrder(){
        Order order = new Order(new Flower(),
                new UserDialog().booleanDialog("Would you like greens?"),
                new UserDialog().doubleDialog("What is your budget?"),
                new Delivery());

        addToOrderbook(order);
    }

    /*
    Tilføjer den givne ordre til arraylisten.
    */
    private void addToOrderbook(Order order){
        if(this.orders.contains(order)){
            System.out.println("Already in the book!");
        } else {
            this.orders.add(order);
        }
    }

    public void printOrders(){
        for(Order o:orders){
            System.out.println(o);
        }
    }
}
