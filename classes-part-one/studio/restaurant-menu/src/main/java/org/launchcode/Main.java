package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

    }
}
class Menu {
    private ArrayList<MenuItem> itemList = new ArrayList<>();
    private Date dateModified = new Date();

    public void lastModified(){
        //returns how many days since dateModified was last changed.
        return;
    }
}
class MenuItem {
    private String itemName;
    private String itemDescription;
    private Double price;
    private ArrayList<String> category = new ArrayList<>();
    //private Date dateAdded = new Date();
    private Boolean isNew;
    public MenuItem(){

    }

    public String getName(){
        return itemName;
    }
    public void setName (String aName){
        itemName = aName;
    }
    public String getDescription(){
        return itemDescription;
    }
    public void setDescription (String aDesc){
        itemDescription = aDesc;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice (Double aPrice){
        price = aPrice;
    }
    public Boolean getIsNew(){
        return isNew;
    }
    public void setIsNew (Boolean aName){
        isNew = aName;
    }
    public MenuItem(String name, String description, Double price, ArrayList<String> category, Boolean isNew){
        this.itemName = name;
        this.itemDescription = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;

    }
//    public Boolean isNew(){
//        //returns true is dateAdded is within a span of the current date
//
//        /*if(dateAdded.){
//            return true;
//        }*/
//        return false;
//    }
}