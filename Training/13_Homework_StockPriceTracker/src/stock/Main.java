package stock;

public class Main {
    public static void main(String[] args) {
        int[] prices = {
                100, 102, 101, 101, 103, 105, 105, 104, 106, 110,
                108, 109, 111, 111, 112, 115, 114, 113, 117, 120,
                120, 120, 121, 119, 122, 125, 123, 126, 128, 130
        };

        int profitDay = findDayWithHighestProfit(prices);
        System.out.println("Day with highest profit: Day " + (profitDay + 1) +
                " (Profit: " + (prices[profitDay] - prices[profitDay - 1]) + ")");

        printPriceDropDays(prices);

    }

    // Private method to find the day with the highest profit
    private static int findDayWithHighestProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int profitDay = -1;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i - 1];
            if (profit > maxProfit) {
                maxProfit = profit;
                profitDay = i;
            }
        }
        return profitDay;
    }

    // Private method to print days when the price dropped
    private static void printPriceDropDays(int[] prices) {
        System.out.println("Days with price drop:");
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                System.out.println("Day " + (i + 1) + ": Dropped from " + prices[i - 1] + " to " + prices[i]);
            }
        }
    }
}