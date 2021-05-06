package com.github.fnsousa.design.patterns.chainofresponsibility;

public class BankA extends BankChain {

    @Override
    public void makePayment() {
        System.out.println("Payment made with Bank A");
    }

    @Override
    public boolean canPay(IDBank id) {
        return IDBank.BANK_A.equals(id);
    }
}
