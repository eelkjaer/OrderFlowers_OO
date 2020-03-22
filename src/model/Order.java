package model;

public class Order {
    static int idCounter = 1;
    int orderId;
    Flower flower;
    boolean greens;
    double maxPrice;
    Delivery delivery;

    public Order(Flower flower, boolean greens, double maxPrice, Delivery delivery){
        this.orderId = idCounter;
        this.flower = flower;
        this.greens = greens;
        this.maxPrice = maxPrice;
        this.delivery = delivery;
        idCounter++;
    }

    private String greensResult(){
        if(this.greens){
            return "Yes";
        } else {
            return "No";
        }
    }

    @Override
    public String toString() {
        if(delivery.address == null || delivery.name == null){
            return "\nOrder no." + orderId
                    + "\n" + flower
                    + "Greens: " + greensResult()
                    + "\nBudget: " + maxPrice
                    + "\nDelivery: No"
                    + "\n";
        } else {
            return "\nOrder no." + orderId
                    + "\n" + flower
                    + "Greens: " + greensResult()
                    + "\nBudget: " + maxPrice
                    + "\n" + delivery
                    + "\n";
        }
    }
}
