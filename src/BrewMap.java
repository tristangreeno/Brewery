import java.util.HashMap;
import java.util.Random;


/**
 * Maps all of the prices, costs, profits, sales, and net profits of all brews.
 */
public class BrewMap {
    private static Random random = new Random();
    private static HashMap<String, Double> brewPrices = new HashMap<>();
    private static HashMap<String, Double> brewCosts = new HashMap<>();
    private static HashMap<String, Integer> brewSales = new HashMap<>();
    private static HashMap<String, Double> brewNetProfits = new HashMap<>();

    private static void brewPrices() {
        brewPrices.put("Dark Horse", 3.25);
        brewPrices.put("Black Stallion", 4.25);
        brewPrices.put("Hidden Turtle", 2.55);
        brewPrices.put("Excalibur", 5.65);
        brewPrices.put("Odin", 2.25);

    }

    private static void brewCosts() {
        brewCosts.put("Dark Horse", 1.75);
        brewCosts.put("Black Stallion", 3.10);
        brewCosts.put("Hidden Turtle", 1.88);
        brewCosts.put("Excalibur", 2.66);
        brewCosts.put("Odin", 1.63);

    }

    static HashMap<String, Integer> brewSales() {
        brewPrices();
        brewCosts();
        brewSales.put("Dark Horse", random.nextInt(999999));
        brewSales.put("Black Stallion", random.nextInt(940987));
        brewSales.put("Hidden Turtle", random.nextInt(750987));
        brewSales.put("Excalibur", random.nextInt(700678));
        brewSales.put("Odin", random.nextInt(154320));

        return brewSales;
    }

    static HashMap<String, Double> brewNetProfits() {
        brewNetProfits.put("Dark Horse", brewSales.get("Dark Horse") * profitCalc("Dark Horse"));
        brewNetProfits.put("Black Stallion", brewSales.get("Black Stallion") * profitCalc("Black Stallion"));
        brewNetProfits.put("Hidden Turtle", brewSales.get("Hidden Turtle") * profitCalc("Hidden Turtle"));
        brewNetProfits.put("Excalibur", brewSales.get("Excalibur") * profitCalc("Excalibur"));
        brewNetProfits.put("Odin", brewSales.get("Odin") * profitCalc("Odin"));

        return brewNetProfits;

    }

    private static double profitCalc(String name){
        return brewPrices.get(name) - brewCosts.get(name);
    }

}
