package com.company;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        double price1=0 , totalprice;
        HashMap<String,Double> priceSet = new HashMap<String, Double>();
        priceSet.put("banana",2.5);
        priceSet.put("oringe",2.4);
        priceSet.put("grap",1.25);
        priceSet.put("milk",3.45);
        priceSet.put("egg",4.65);
        priceSet.put("water",4.90);
        System.out.println(priceSet.containsKey("banan"));
        System.out.println("enter the item you want ");
        String item = scan.nextLine();
        for(String name:priceSet.keySet()) {
            if (item.equalsIgnoreCase(name))
               price1 = priceSet.get(name);

        }
        int quntity =1+ rand.nextInt(10);
        System.out.println(quntity);
        System.out.println(price1);
        totalprice = quntity*price1;
        System.out.println(totalprice);



    }
}
