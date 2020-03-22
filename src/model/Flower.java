package model;

import java.util.ArrayList;
import java.util.Collections;

public class Flower {
    private static int idCounter = 0;
    int id;
    private ArrayList<String> flowers = new ArrayList<>();

    public Flower(){
        this(new UserDialog().stringDialog("Which flowers would you like? (Comma-seperated)"));
    }

    public Flower(String flowerName){
        this.id = idCounter;
        String[] flowers = flowerName.replaceAll("\\s+","").split(",");
        Collections.addAll(this.flowers,flowers);
        idCounter++;
    }

    public String getFlowers(){
        return flowers.toString();
    }


    @Override
    public String toString(){
        String t = "";
        for(int i=0;i<flowers.size();i++){

            t += flowers.get(i) + "\n";
        }
        return "Flowers of your choice:\n" + t;
    }
}
