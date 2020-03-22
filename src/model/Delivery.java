package model;

public class Delivery {
    private static int idCounter=0;
    int id;
    String name, address;

    public Delivery(){
        UserDialog ud = new UserDialog();
        if(ud.booleanDialog("Would you like delivery?")){
            this.id = idCounter;
            this.name = ud.stringDialog("What is your name?");
            this.address = ud.stringDialog("What is your address?");
            idCounter++;
        }
    }


    public Delivery(String name, String address){
        this.id = idCounter;
        this.name = name;
        this.address = address;
        idCounter++;
    }

    public void askDelivery(){

    }

    @Override
    public String toString(){
        return "Delivery will happen to " + this.name
                + "\nAddress: " + this.address;
    }

}
