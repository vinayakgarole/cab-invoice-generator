package com.bridgelabz;

public class CabInvoiceGenerator {
    /**
     *   variable
     */
    private static final int COST_PER_KM = 10;
    private static final int COST_PER_MIN = 1;
    private static final int MIN_FARE = 5;
    public double CalculateFare(double distance, int time) {
        /**
         * formula for total fare
         */
        double totalFare = distance * COST_PER_KM + time * COST_PER_MIN;
        if (totalFare < MIN_FARE) {
            return MIN_FARE;
        }
        return totalFare;
    }

    public static void main(String[] args) {
        /**
         * create object for CabInvoiceGenerator class, object name is cabInvoiceGenerator
         */
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        /**
         * calling CalculateFare method from cabInvoiceGenerator object
         * and print o/p
         */
        System.out.println(cabInvoiceGenerator.CalculateFare(5, 20) + " Rs");
    }

}

