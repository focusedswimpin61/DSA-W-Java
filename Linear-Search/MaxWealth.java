
// LeetCode Problem: https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        // The main method is currently empty.
        // It can be used to test the maximumWealth method if desired.
    }

    /**
     * This method computes the maximum wealth of any customer.
     * Each row in the "accounts" 2D array represents a customer,
     * and each column represents the amount of money in a specific bank account.
     *
     * @param accounts a 2D array where accounts[i][j] is the money the i-th customer has in the j-th bank.
     * @return the maximum wealth (sum of money in all accounts for a single customer) among all customers.
     */
    public int maximumWealth(int[][] accounts) {
        // Initialize "ans" with the smallest possible integer value.
        // This will hold the maximum wealth found as we iterate through the customers.
        int ans = Integer.MIN_VALUE;
        
        // Loop through each customer's accounts.
        // Each "ints" array represents the bank accounts for one customer.
        for (int[] ints : accounts) {
            // Start a new sum for the current customer.
            int sum = 0;
            
            // Sum up all bank account balances for this customer.
            for (int anInt : ints) {
                sum += anInt; // Accumulate the total money for the customer.
            }
            
            // After summing, compare the current customer's total wealth with the maximum found so far.
            if (sum > ans) {
                ans = sum; // Update "ans" if the current sum is greater.
            }
        }
        
        // After checking all customers, return the maximum wealth found.
        return ans;
    }
}
