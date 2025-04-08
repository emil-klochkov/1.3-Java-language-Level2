package Ex2;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Restaurant> restaurants = new TreeSet<>();

        restaurants.add(new Restaurant("Restaurant1", 8));
        restaurants.add(new Restaurant("Restaurant1", 7));
        restaurants.add(new Restaurant("La Taula", 5));
        restaurants.add(new Restaurant("Can Joan", 10));
        restaurants.add(new Restaurant("Can Joan", 8));

        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}