package com.github.fnsousa.design.patterns.chainofresponsibility;

public class Client {

    public static void main(String[] args) {

        BankChain bankChain = new BankA();
        bankChain.setNext(new BankB());
        bankChain.setNext(new BankNotFound());

        bankChain.pay(IDBank.BANK_A);
        bankChain.pay(IDBank.BANK_B);
        bankChain.pay(IDBank.BANK_C);

    }

}
