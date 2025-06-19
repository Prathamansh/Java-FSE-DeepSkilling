public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobileClient = new MobileApp("Prathamansh");
        Observer webClient = new WebApp("Jasrotia");
        market.registerObserver(mobileClient);
        market.registerObserver(webClient);
        market.setStockPrice("ICE", 185.75);
        market.setStockPrice("WATER", 2734.23);
        market.removeObserver(webClient);
        market.setStockPrice("FIRE", 750.50);
    }
}