/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

import java.util.ArrayList;

/**
 *
 * @author rouas
 */
public class Bank {
    private final ArrayList<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public Double getTotalBalance() {
        double totalBalance = 0.0;
        for (Customer customer : customers) {
            totalBalance += customer.getTotalAccountBalance();
        }
        return totalBalance;
    }
}
