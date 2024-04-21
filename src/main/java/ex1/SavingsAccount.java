/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author rouas
 */
class SavingsAccount extends BankAccount {
    private final Double interestRate;

    public SavingsAccount(Integer accountNumber, Double balance, Double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public Double calculateInterest() {
        return balance * (interestRate / 100);
    }

    public Double getInterestRate() {
        return interestRate;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }
}
