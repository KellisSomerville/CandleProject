import java.util.logging.ConsoleHandler;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    String name;
    int amount;
    double price;
    double burnTime;

    public Main(String name, int amount, double price, double burnTime) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.burnTime = burnTime;
    }
        String getName() {
        return name;
        }
        int getAmount() {
        return amount;
        }
        double getPrice() {
        return price;
        }
        double getBurnTime() {
        return burnTime;
        }
        public static void main(String[] args) {
        Main candle1 = new Main("Enchanted Moonbeam Delight", 6, 12.45, 4);
        Main candle2 = new Main("Mystical Ocean Breeze Elixir", 8, 23.54, 5);
        Main candle3 = new Main("Whimsical Fairy Garden Serenade", 5, 15.11, 11);

        System.out.println("Name: " + candle1.getName() + "\n" + "Amount: " + candle1.getAmount() + "\n" + "Price: " + candle1.getPrice() + "\n" + "Burn Time: " + candle1.getBurnTime() + "\n" + "Dollar Per Burn Time: " + (candle1.getPrice() / candle1.getBurnTime()) + "\n" + "++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Name: " + candle2.getName() + "\n" + "Amount: " + candle2.getAmount() + "\n" + "Price: " + candle2.getPrice() + "\n" + "Burn Time: " + candle2.getBurnTime() + "\n" + "Dollar Per Burn Time: " + (candle2.getPrice() / candle2.getBurnTime()) + "\n" + "++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Name: " + candle3.getName() + "\n" + "Amount: " + candle3.getAmount() + "\n" + "Price: " + candle3.getPrice() + "\n" + "Burn Time: " + candle3.getBurnTime() + "\n" + "Dollar Per Burn Time: " + (candle3.getPrice() / candle3.getBurnTime()) + "\n" + "++++++++++++++++++++++++++++++++++++++++");
    }
}
