package com.github.fnsousa.design.patterns.chainofresponsibility;

public class BankNotFound extends BankChain {

    @Override
    public void makePayment() {
        System.out.println("Unrealized payment!");
    }

    @Override
    public boolean canPay(IDBank id) {
        return true;
    }
}
