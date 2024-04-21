/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author rouas
 */
class CheckingAccount extends BankAccount {
    private Double overdraftAllowed;

    public CheckingAccount(Integer accountNumber, Double balance, Double overdraftAllowed) {
        super(accountNumber, balance);
        this.overdraftAllowed = overdraftAllowed;
    }

    public void setOverdraftAllowed(Double overdraftAllowed) {
        this.overdraftAllowed = overdraftAllowed;
    }

    public Double getOverdraftAllowed() {
        return overdraftAllowed;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftAllowed) {
            balance -= amount;
        } else {
            System.out.println("Opération refusée : découvert non autorisé.");
        }
    }
}
