package org.example.core;

import org.example.exceptions.InsufficientBalanceException;

public class SavingsBank extends Account {

    private int interestRate;

    public SavingsBank( double balance, Client client, int interestRate ) {
        super( balance, client );
        this.interestRate = interestRate;
    }

    @Override
    public void extract( double amount ) throws InsufficientBalanceException {

        if ( balance < amount ) {
            throw new InsufficientBalanceException( "Insufficient Balance" );
        }

        balance -= amount;
    }

    public void chargeInterest() {
        balance += balance * interestRate / 100;
    }
}
