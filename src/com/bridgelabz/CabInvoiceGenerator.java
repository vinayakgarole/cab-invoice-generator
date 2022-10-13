package com.bridgelabz;

public class CabInvoiceGenerator {

    private static final int COST_PER_KM = 10;
    private static final int COST_PER_MIN = 1;
    private static final int MIN_FARE = 5;

    /**
     * create a method name as CalculateFare, this is parameterized method
     * Created a method to calculate the fare of journey
     *
     * @param distance is 5
     * @param time
     * @return total fare
     */
    public double calculateFare(double distance, int time) {
        /**
         * formula for total fare
         */
        double totalFare = distance * COST_PER_KM + time * COST_PER_MIN;
        /**
         * if total fare is greater than min fare then
         */
        if (totalFare < MIN_FARE) {
            /**
             * return minimum fare
             */
            return MIN_FARE;
        }
        /**
         * return total fare
         */
        return totalFare;
    }

    /**
     * Creating a parameterized method name as calculateFareForMultipleRides
     * Take a multiple ride and calculate the aggregate total for all
     *
     * @param rides multiple ride
     * @return total fare
     */
    public double calculateFareForMultipleRides(Ride[] rides) {
        // variable
        double totalFare = 0.0;
        /**
         * using for each loop
         */
        for (Ride ride : rides) {
            totalFare = calculateFare(ride.getDistance(), ride.getTime());
        }
        /**
         * return total fare
         */
        return totalFare;
    }

    /**
     * @param rides
     * @return
     */
    public InvoiceSummery invoiceSummaryCalculation(Ride[] rides) {
        double totalFare = 0.0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride.getDistance(), ride.getTime());
        }
        return new InvoiceSummery(rides.length, totalFare);
    }


    /**
     * create a main method ,all program execute in main method
     *
     * @param args no arguments
     */
    public static void main(String[] args) {
        /**
         * create object for CabInvoiceGenerator class, object name is cabInvoiceGenerator
         */
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        /**
         * calling CalculateFare method from cabInvoiceGenerator object
         * and print o/p
         */
        System.out.println(cabInvoiceGenerator.calculateFare(5, 20) + " Rs");
    }
}