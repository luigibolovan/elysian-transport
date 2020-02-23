package com.elysian.transport.logic;

public class DefaultCalculator implements BrokerCalculator {

    private static final int COST_TRANSPORT_HELICOPTER      = 1000;
    private static final int COST_TRANSPORT_PLANE           = 800;
    private static final int COST_TRANSPORT_CAR             = 500;
    private static final int COST_TRANSPORT_TRUCK           = 400;
    private static final int COST_TRANSPORT_TRAIN           = 250;
    private static final int COST_TRANSPORT_SHIP            = 150;

    private static final int COST_PALLET_HELICOPTER         = 250;
    private static final int COST_PALLET_PLANE              = 200;
    private static final int COST_PALLET_CAR                = 100;
    private static final int COST_PALLET_TRUCK              = 150;
    private static final int COST_PALLET_TRAIN              = 75;
    private static final int COST_PALLET_SHIP               = 50;

    @Override
    public String findBestOption(int numberOfPallets, int prio) {
        String outputMessage = null;
        if(numberOfPallets <= 0){
            outputMessage = "Numar de paleti invalid!";
        }else {
            switch (prio) {
                case 0:
                    if (numberOfPallets > 1 && numberOfPallets <= 50) {
                        outputMessage = "Tirul este cea mai optima modalitate de transport. Cost: " + (COST_PALLET_TRUCK * numberOfPallets + COST_TRANSPORT_TRUCK);
                    } else if (numberOfPallets > 50) {
                        outputMessage = "Vaporul este cea mai optima modalitate de transport. Cost: " + (COST_PALLET_SHIP * numberOfPallets + COST_TRANSPORT_SHIP);
                    } else {
                        outputMessage = "Elicopterul este cea mai optima modalitate de transport. Cost: " + (COST_PALLET_HELICOPTER * numberOfPallets + COST_TRANSPORT_HELICOPTER);
                    }
                    break;
                case 1:
                    if (numberOfPallets > 1 && numberOfPallets <= 50) {
                        outputMessage = "Tirul este cea mai optima modalitate de transport. Cost: " + (COST_PALLET_TRUCK * numberOfPallets + COST_TRANSPORT_TRUCK);
                    } else if (numberOfPallets > 50) {
                        outputMessage = "Vaporul este cea mai optima modalitate de transport. Cost: " + (COST_PALLET_SHIP * numberOfPallets + COST_TRANSPORT_SHIP);
                    } else {
                        outputMessage = "Avionul este cea mai optima modalitate de transport. Cost: " + (COST_PALLET_PLANE * numberOfPallets + COST_TRANSPORT_PLANE);
                    }
                    break;
                case 2:
                case 3:
                    if (numberOfPallets > 1 && numberOfPallets <= 50) {
                        outputMessage = "Trenul este cea mai optima modalitate de transport. Cost: " + (COST_PALLET_TRAIN * numberOfPallets + COST_TRANSPORT_TRAIN);
                    } else if (numberOfPallets > 50) {
                        outputMessage = "Vaporul este cea mai optima modalitate de transport. Cost: " + (COST_PALLET_SHIP * numberOfPallets + COST_TRANSPORT_SHIP);
                    } else {
                        outputMessage = "Masina este cea mai optima modalitate de transport. Cost: " + (COST_PALLET_CAR * numberOfPallets + COST_TRANSPORT_CAR);
                    }
                    break;
                default:
                    outputMessage = "Nu reprezinta o prioritate";
                    break;
            }
        }
        return outputMessage;
    }
}
