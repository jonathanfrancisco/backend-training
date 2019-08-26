package com.whitecloak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgrammingInBusiness {

    public static void main(String[] args) {

        List<String> cheapestCommodities = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first kind of commodities: ");
        cheapestCommodities.add(getCheapest(scanner.nextLine()));

        System.out.print("Enter second kind of commodities: ");
        cheapestCommodities.add(getCheapest(scanner.nextLine()));

        System.out.print("Enter third kind of commodities: ");
        cheapestCommodities.add(getCheapest(scanner.nextLine()));

        System.out.print("Enter fourth kind of commodities: ");
        cheapestCommodities.add(getCheapest(scanner.nextLine()));

        System.out.print("Enter fifth kind of commodities: ");
        cheapestCommodities.add(getCheapest(scanner.nextLine()));

        printResults(cheapestCommodities);
    }

    public static String getCheapest(String stringCommodities) {
        String commoditiesArray[] = String.join("", stringCommodities.split(" ")).split(",");
        String cheapest = commoditiesArray[0];
        for(String commodity: commoditiesArray) {
            if(getPrice(cheapest) > getPrice(commodity)) {
                cheapest = commodity;
            }
        }
        return cheapest;
    }

    public static int getPrice(String commodity) {
       return Integer.parseInt(commodity.substring(commodity.indexOf('-')+1));
    }

    public static String getName(String commodity) {
        return commodity.substring(0, commodity.indexOf('-'));
    }

    public static void printResults(List<String> cheapestCommodities) {
        int allCheapestTotal = 0;
        System.out.print("Cheapest: ");
        for(int i = 0;i<cheapestCommodities.size();i++) {
            String name = getName(cheapestCommodities.get(i));
            int price = getPrice(cheapestCommodities.get(i));
            allCheapestTotal += price;
            System.out.print(name+(i != cheapestCommodities.size()-1 ? ", " : ""));
        }
        System.out.println("\nTotal: "+allCheapestTotal);
    }

}
