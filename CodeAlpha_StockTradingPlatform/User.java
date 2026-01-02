import java.util.HashMap;
public class User{
    String name;
    double balance;
    HashMap<String, Integer> portfolio = new HashMap<>();
    User(String name,double balance) {
        this.name = name;
        this.balance = balance;
    }
    void buyStock(String symbol, int quantity,double price) {
        double cost = quantity * price;
        if(cost <= balance){
            balance -= cost;
            portfolio.put(symbol, portfolio.getOrDefault(symbol, 0) + quantity);
            System.out.println("Stock bought succesfully!");
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }
    void sellStock(String symbol, int quantity,double price) {
        if(portfolio.getOrDefault(symbol, 0) >= quantity) {
            portfolio.put(symbol,portfolio.get(symbol) - quantity);
            balance += quantity * price;
            System.out.println("Stock sold successfully!");
        }
        else {
            System.out.println("Not enough stocks to sell!");
        }
    }
    void displayPortfolio() {
        System.out.println("\nPortfolio:");
        for(String key : portfolio.keySet()){
            System.out.println(key + "  : " + portfolio.get(key) + "shares");
        }
        System.out.println("Balance: " + balance);
        
    }
}