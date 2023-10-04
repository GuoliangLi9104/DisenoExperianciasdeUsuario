/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect;

import java.util.*;
import java.util.concurrent.TimeUnit;
import Proyect.Cashier.*;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

;

/**
 *
 * @author Li
 */
public class Simulation {

    public static void simulateBank(int numberOfCustomers, JTextArea Tiempo, JTextArea clientesGenerados, JTextArea cajas) {
        List<Cashier> cashiers = new ArrayList<>();
        Queue<Customer> waitingQueue = new PriorityQueue<>(Comparator.comparing(Customer::getPriority));

        for (int i = 1; i <= 4; i++) {
            cashiers.add(new Cashier(i));
        }

        for (int i = 1; i <= numberOfCustomers; i++) {
            waitingQueue.add(new Customer(i));
        }

        List<Customer> customersOrderedByNumber = new ArrayList<>(waitingQueue);
        customersOrderedByNumber.sort(Comparator.comparing(Customer::getCustomerNumber));

        clientesGenerados.append("Clientes generados:\n");

        for (Customer customer : customersOrderedByNumber) {

            clientesGenerados.append("\nCliente " + customer.getCustomerNumber() + " - Prioridad " + customer.getPriority() + "\n ");

        }

        JOptionPane.showMessageDialog(null, "Empezando");

        int elapsedTime = 0;

        while (!waitingQueue.isEmpty() || cashiers.stream().anyMatch(cashier -> !cashier.isFree())) {

            Tiempo.setText("\nTiempo transcurrido: " + elapsedTime + " minutos\n");

            for (Cashier cashier : cashiers) {
                if (cashier.isFree() && !waitingQueue.isEmpty()) {

                    Customer customer = waitingQueue.poll();
                    cashier.serveCustomer(customer);
                    cashier.incrementCustomersServed();

                } else {
                    cashier.serveCustomer();
                }
                cajas.append(cashier.toString());
                System.out.println(cashier.toString());;
            }
            elapsedTime++;
            System.out.println("");
            try {

                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {

                JOptionPane.showMessageDialog(null, "Error en el temporizador");

            }
        }

        String info = "";

        info += "\n";
        info += "RESUMEN\n";

        for (Cashier cashier : cashiers) {
            info += "\n------------------------------------\n";
            info += "\nCaja " + cashier.getCashierNumber() + ":\n";
            info += "\nClientes atendidos: " + cashier.getCustomersServed() + "\n";
            info += "\nTiempo de atención total: " + cashier.getTotalTimeOfService() + " minutos\n";
        }

        info += "\n------------------------------------\n";
        info += "\nTotal de clientes que entraron en el banco: " + numberOfCustomers + "\n";
        info += "\nTodos los clientes han sido atendidos en " + elapsedTime + " minutos.\n";

        JOptionPane.showMessageDialog(null, info);
    }

}
