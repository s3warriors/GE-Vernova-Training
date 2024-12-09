package Assignments.StockManagement;

import java.util.ArrayList;
import java.util.List;

class Stock {
    String name;
    int numberOfShares;
    double sharePrice;

    Stock(String name, int numberOfShares, double sharePrice) {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    double getStockValue() {
        return numberOfShares * sharePrice;
    }
}

