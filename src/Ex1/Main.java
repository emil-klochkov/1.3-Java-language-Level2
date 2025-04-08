package Ex1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();

        Restaurant r1 = new Restaurant("Can Joan", 5);
        Restaurant r2 = new Restaurant("La Taula", 4);
        Restaurant r3 = new Restaurant("Can Joan", 5); // Duplicate

        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3); // Will not be added because it's a duplicate

        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}
