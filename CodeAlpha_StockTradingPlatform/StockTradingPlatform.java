import java.util.Scanner;
public class StockTradingPlatform{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stock stock = new Stock("TCS",3500);
        User user = new User("Mahisha",100000);
        int choice;
        do {
            System.out.println("\n---Stock Trading platform ---");
            System.out.println("1. View Market Data");
            System.out.println("2.Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View portfolio");
            System.out.println("5.Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Stock: " + stock.symbol);
                    System.out.println("Price: " + stock.price);
                    break;
                case 2:
                    System.out.print("Enter quantity to buy: ");
                    int buyQty = sc.nextInt();
                    user.buyStock(stock.symbol, buyQty, stock.price);
                    break;
                case 3:
                    System.out.println("Enter quantity to sell: ");
                    int sellQty = sc.nextInt();
                    user.sellStock(stock.symbol, sellQty, stock.price);
                    break;
                case 4:
                    user.displayPortfolio();
                    break;
                case 5:
                    System.out.println("Thank you for trading!");
                    break;
                default:
                    System.out.println("Invalid choice!");

            }
        }while (choice != 5);
        sc.close();
    }
} 