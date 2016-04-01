import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Creates lists of data concerning the brews, such as most profitable and highest sales.
 */
public class BrewLists {
    private static HashMap<String, Integer> sales = BrewMap.brewSales();
    private static HashMap<String, Double> netProfits = BrewMap.brewNetProfits();
    private static ArrayList<Double> netList = new ArrayList<>(BrewMap.brewNetProfits().values());
    private static ArrayList<Integer> salesList = new ArrayList<>(BrewMap.brewSales().values());

    static void displayNetProfits() {
        HashMap<Double, String> reverseProf = new HashMap<>();
        reverseProf.put(netProfits.get("Dark Horse"), "Dark Horse");
        reverseProf.put(netProfits.get("Odin"), "Odin");
        reverseProf.put(netProfits.get("Hidden Turtle"), "Hidden Turtle");
        reverseProf.put(netProfits.get("Excalibur"), "Excalibur");
        reverseProf.put(netProfits.get("Black Stallion"), "Black Stallion");

        Collections.sort(netList);
        Collections.reverse(netList);

        for (Double value:
            netList) {
            System.out.println("$" + value + " net profit for the " + reverseProf.get(value));
        }
    }

    static void displaySales() {
        HashMap<Integer, String> reverseSale = new HashMap<>();
        reverseSale.put(sales.get("Dark Horse"), "Dark Horse");
        reverseSale.put(sales.get("Odin"), "Odin");
        reverseSale.put(sales.get("Hidden Turtle"), "Hidden Turtle");
        reverseSale.put(sales.get("Excalibur"), "Excalibur");
        reverseSale.put(sales.get("Black Stallion"), "Black Stallion");

        Collections.sort(salesList);
        Collections.reverse(salesList);

        for (Integer value:
             salesList) {
            System.out.println(reverseSale.get(value) + " has sold " + value + " units.");
        }
    }

}


