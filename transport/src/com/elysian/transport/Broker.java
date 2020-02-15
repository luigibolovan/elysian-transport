package com.elysian.transport;

public class Broker{

    private int noOfPallets;
    private int priority;
    private BrokerCalculator costCalculator;

    public void setNoOfPallets(int pallets){
        noOfPallets = pallets;
    }

    public void setPriority(int prio){
        priority = prio;
    }

    public void setCostCalculator(BrokerCalculator calculator){
        costCalculator = calculator;
    }

    public void getMinimumCost(int numberOfPallets, int prio){
        costCalculator.findBestOption(numberOfPallets, prio);
    }
}
