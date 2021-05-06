package com.github.fnsousa.design.patterns.chainofresponsibility;

public abstract class BankChain {

    protected BankChain next;

    protected abstract void makePayment();

    public void pay(IDBank id) {
        if(canPay(id)) {
            makePayment();
        } else {
            this.next.pay(id);
        }
    }

    public abstract boolean canPay(IDBank id);

    public void setNext(BankChain next) {
        if(this.next == null) {
            this.next = next;
        } else {
            this.next.setNext(next);
        }
    }

}
