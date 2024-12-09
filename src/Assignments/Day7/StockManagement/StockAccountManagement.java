package Assignments.Day7.StockManagement;

public class StockAccountManagement {
    public static void main(String[] args) {
        StockPortfolio portfolio = new StockPortfolio();
        portfolio.addStock(new Stock("Apple", 10, 150));
        portfolio.addStock(new Stock("Google", 5, 2800));

        portfolio.printReport();
    }
}