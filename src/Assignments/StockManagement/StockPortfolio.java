package Assignments.StockManagement;

import java.util.ArrayList;
import java.util.List;

class StockPortfolio {
    List<Stock> stocks = new ArrayList<>();

    void addStock(Stock stock) {
        stocks.add(stock);
    }

    void printReport() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            double stockValue = stock.getStockValue();
            System.out.println("Stock: " + stock.name + ", Value: " + stockValue);
            totalValue += stockValue;
        }
        System.out.println("Total Portfolio Value: " + totalValue);
    }
}
