package com.elysian.transport.logic;

public class Broker{
    private BrokerCalculator costCalculator;

    public void setCostCalculator(BrokerCalculator calculator){
        costCalculator = calculator;
    }

    public String getMinimumCost(int numberOfPallets, int prio){
       return costCalculator.findBestOption(numberOfPallets, prio);
    }
}
