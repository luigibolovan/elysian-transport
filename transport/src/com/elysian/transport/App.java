package com.elysian.transport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Broker transportBroker = new Broker();
        transportBroker.setCostCalculator(new DefaultCalculator());
        while (true) {
            System.out.println("Transport Broker");
            System.out.println("Prioritate: \n 0 - foarte urgent \n 1 - urgent \n 2 - normal \n 3 - ieftin");
            try {
                int prio = Integer.parseInt(reader.readLine());
                if (prio > 3) {
                    System.out.println("Nu reprezinta o prioritate");
                    System.exit(1);
                }
                transportBroker.setPriority(prio);
                System.out.println("Numar paleti: ");
                int palletNo = Integer.parseInt(reader.readLine());
                transportBroker.setNoOfPallets(palletNo);
                transportBroker.getMinimumCost(palletNo, prio);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
