package com.github.fnsousa.design.patterns.chainofresponsibility;

public class BankB extends BankChain {

    @Override
    public void makePayment() {
        System.out.println("Payment made with Bank B");
    }

    @Override
    public boolean canPay(IDBank id) {
        return IDBank.BANK_B.equals(id);
    }
}
