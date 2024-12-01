/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart2;

/**
 *
 * @author Lenny Manset
 */
public class CreditCard {
/**
 * The CreditCard class represents a credit card with an owner (Person),
 * a balance (current amount spent), and a credit limit (maximum allowed spending).
 */
    // Fields (variables) that store the credit card's data
    private Money balance; // The current balance or amount spent
    private Money creditLimit; // The maximum allowed balance
    private Person owner; // The owner of the credit card


    /**
     * Constructor for the CreditCard class.
     * This initializes the credit card with an owner and a credit limit.
     *
     * @param cardHolder The person who owns the credit card.
     * @param limit      The maximum allowed spending limit for the credit card.
     */
    public CreditCard(Person cardHolder, Money limit) {
        // Assign the parameters to the fields of the class
        owner = cardHolder; // Set the owner of the card to the given person
        creditLimit = new Money(limit); // Create a copy of the given limit to avoid sharing references
        balance = new Money(0.0); // Initialize the balance to zero
    }


    /**
     * Gets the current balance of the credit card.
     * This method returns a copy of the balance to prevent accidental modification.
     *
     * @return A copy of the current balance (as a Money object).
     */
    public Money getBalance() {
        // Return a new Money object with the same value as the balance
        return new Money(balance);
    }


    /**
     * Gets the credit limit of the credit card.
     * This method returns a copy of the credit limit to prevent accidental modification.
     *
     * @return A copy of the credit limit (as a Money object).
     */
    public Money getCreditLimit() {
        // Return a new Money object with the same value as the credit limit
        return new Money(creditLimit);
    }


    /**
     * Gets the owner's details as a string.
     * This calls the toString method of the Person class to retrieve the owner's information.
     *
     * @return A string containing the owner's details.
     */
    public String getPersonals() {
        // Use the toString method from the Person class to get owner details
        return owner.toString();
    }


    /**
     * Charges an amount to the credit card. This adds the given amount to the balance,
     * but only if the new balance does not exceed the credit limit.
     *
     * @param amount The amount to charge (as a Money object).
     */
    public void charge(Money amount) {
        // Calculate the new balance after adding the charge
        Money newBalance = balance.add(amount);


        // Check if the new balance is within the credit limit
        if (newBalance.compareTo(creditLimit) <= 0) {
            // If the new balance is less than or equal to the credit limit, update the balance
            balance = newBalance;
            System.out.println("Charge: " + amount); // Print the amount charged
        } else {
            // If the new balance exceeds the credit limit, deny the charge
            System.out.println("Exceeds credit limit"); // Print a message that the limit is exceeded
        }
    }


    /**
     * Makes a payment on the credit card. This subtracts the given amount from the balance.
     *
     * @param amount The amount to pay (as a Money object).
     */
    public void payment(Money amount) {
        // Subtract the payment amount from the balance
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount); // Print the amount paid
    }
}
    

