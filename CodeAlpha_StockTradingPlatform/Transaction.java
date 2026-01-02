public class Transaction {
    String type;
    String stockSymbol;
    int quantity;
    
    Transaction(String type,String stockSymbol, int quantity) {
        this.type = type;
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
    }
}