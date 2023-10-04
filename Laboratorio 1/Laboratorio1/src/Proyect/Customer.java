/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect;

import java.util.Random;

/**
 *
 * @author Li
 */
public class Customer {

    private int customerNumber;
    private String priority;
    private int processingTimeInSeconds;
    private int time;

    public Customer(int customerNumber) {
        this.customerNumber = customerNumber;
        this.priority = generateRandomPriority(customerNumber);
        this.processingTimeInSeconds = generateRandomTime();
        this.time = 0;
    }

    public String getPriority() {
        return priority;
    }

    public int getTime() {
        return time;
    }

    public void increaseTime() {
        time++;
    }

    private int generateRandomTime() {
        return (int) (Math.random() * 24) + 2; // Between 2 and 25
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getProcessingTimeInSeconds() {
        return processingTimeInSeconds;
    }

    private String generateRandomPriority(int customerNumber) {
        Random rand = new Random();
        int randomPriority = rand.nextInt(4);
        char priorityLetter;
        switch (randomPriority) {
            case 0:
                priorityLetter = 'A';
                break;
            case 1:
                priorityLetter = 'B';
                break;
            case 2:
                priorityLetter = 'C';
                break;
            default:
                priorityLetter = 'D';
                break;
        }
        return priorityLetter + Integer.toString(customerNumber); // Combine priority letter with customer number
    }
}

