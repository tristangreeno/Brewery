/**
 *This program is designed to store brew names, prices and sales into a hash map to reference later.
 * The program will create the hash maps first using brewSales and brewNetProfits, and then display them.
 * The sales and profits will be ordered from greatest to least in the display.
 */
public class Main {

    public static void main(String[] args) {

        BrewMap.brewSales();
        BrewMap.brewNetProfits();
        BrewLists.displaySales();
        BrewLists.displayNetProfits();

    }
}
