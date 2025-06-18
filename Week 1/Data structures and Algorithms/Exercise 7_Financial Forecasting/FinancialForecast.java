public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecastRecursive(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return forecastRecursive(presentValue, rate, years - 1) * (1 + rate);
    }
    public static void main(String[] args) {
        double presentValue = 10000.0;
        double rate = 0.10;            // 10% annual growth
        int years = 5;
        double futureValueRecursive = forecastRecursive(presentValue, rate, years);
        System.out.printf("Recursive Forecast Value (Year %d): Rs %.2f\n", years, futureValueRecursive);
    }
}
