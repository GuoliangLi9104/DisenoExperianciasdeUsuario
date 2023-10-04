/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect;

import java.util.List;

/**
 *
 * @author Li
 */
public class Cashier {

    private int totalCustomersServed;
    private int totalTimeOfService;
    private Customer currentCustomer;
    private int currentTime;
    private List<Customer> waitingQueue;
    private int cashierNumber;
    private int totalServiceTime;
    private int currentCustomerTime;
    private int customersServed;

    public Cashier(int cashierNumber) {
        this.cashierNumber = cashierNumber;
        this.currentCustomer = null;
        customersServed = 0;
        this.totalServiceTime = 0;
        this.currentCustomerTime = 0;
    }

    public int totalCustomersServed() {
        return totalCustomersServed;
    }

    public int getCashierNumber() {
        return cashierNumber;
    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public int getCustomersServed() {
        return customersServed;
    }

    public int getTotalTimeOfService() {
        return totalServiceTime;
    }

    public int incrementCustomersServed() {
        return customersServed++;
    }

    public boolean isFree() {
        return currentCustomer == null;
    }

    public void serveCustomer(Customer customer) {
        currentCustomer = customer;
        currentCustomerTime = 0;
    }

    public void serveCustomer() {
        if (currentCustomer != null) {
            currentCustomer.increaseTime();
            currentCustomerTime++;
            totalServiceTime++;
            if (currentCustomer.getTime() >= currentCustomer.getProcessingTimeInSeconds()) {
                currentCustomer = null;
            }
        }
    }

    @Override
    public String toString() {
        String status;
        if (currentCustomer == null) {
            status = "\n------------------------------------" + "\n"
                    + "\nCashier " + cashierNumber + ": Free" + "\n"
                    + "\nCashier " + cashierNumber + " total service time: " + totalServiceTime + " minutes";
            
        } else {
            status = "\n------------------------------------" + "\n"
                    + "\nCashier " + cashierNumber + ": Serving Customer " + currentCustomer.getCustomerNumber()
                    + " \nPriority " + currentCustomer.getPriority() + " Time spent at the cashier: " + currentCustomer.getTime() + " minutes" + "\n"
                    + "\nCashier " + cashierNumber + " total service time: " + totalServiceTime + " minutes";

        }

        return status;
    }
}

