package com.elysian.transport;

public class DefaultCalculator implements BrokerCalculator {

    private static final int COST_TRANSPORT_PALLET_HELICOPTER    = 1000;
    private static final int COST_TRANSPORT_PALLET_PLANE         = 800;
    private static final int COST_TRANSPORT_PALLET_TRUCK         = 400;
    private static final int COST_TRANSPORT_PALLET_CAR           = 500;
    private static final int COST_TRANSPORT_PALLET_TRAIN         = 250;
    private static final int COST_TRANSPORT_PALLET_SHIP          = 150;
    @Override
    public void findBestOption(int numberOfPallets, int prio) {
        switch(prio){
            case 0:
                if(numberOfPallets > 1 && numberOfPallets <= 50) {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Tirul este cea mai optima modalitate de transport");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Cost:" + COST_TRANSPORT_PALLET_TRUCK * numberOfPallets);
                    System.out.println("-------------------------------------------------");
                }else if(numberOfPallets > 50){
                    System.out.println("-------------------------------------------------");
                    System.out.println("Vaporul este cea mai optima modalitate de transport");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Cost:" + COST_TRANSPORT_PALLET_SHIP * numberOfPallets);
                    System.out.println("-------------------------------------------------");
                }else{
                    System.out.println("-------------------------------------------------");
                    System.out.println("Elicopterul este cea mai optima modalitate de transport");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Cost:" + COST_TRANSPORT_PALLET_HELICOPTER * numberOfPallets);
                    System.out.println("-------------------------------------------------");
                }
                break;
            case 1:
                if(numberOfPallets > 1 && numberOfPallets <= 50) {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Tirul este cea mai optima modalitate de transport");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Cost:" + COST_TRANSPORT_PALLET_TRUCK * numberOfPallets);
                    System.out.println("-------------------------------------------------");
                }else if(numberOfPallets > 50){
                    System.out.println("-------------------------------------------------");
                    System.out.println("Vaporul este cea mai optima modalitate de transport");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Cost:" + COST_TRANSPORT_PALLET_SHIP * numberOfPallets);
                    System.out.println("-------------------------------------------------");
                }else{
                    System.out.println("-------------------------------------------------");
                    System.out.println("Avionul este cea mai optima modalitate de transport");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Cost:" + COST_TRANSPORT_PALLET_PLANE * numberOfPallets);
                    System.out.println("-------------------------------------------------");
                }
                break;
            case 2:
                if(numberOfPallets > 1 && numberOfPallets <= 50) {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Trenul este cea mai optima modalitate de transport");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Cost:" + COST_TRANSPORT_PALLET_TRAIN * numberOfPallets);
                    System.out.println("-------------------------------------------------");
                }else if(numberOfPallets > 50){
                    System.out.println("-------------------------------------------------");
                    System.out.println("Vaporul este cea mai optima modalitate de transport");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Cost:" + COST_TRANSPORT_PALLET_SHIP * numberOfPallets);
                    System.out.println("-------------------------------------------------");
                }else{
                    System.out.println("-------------------------------------------------");
                    System.out.println("Masina este cea mai optima modalitate de transport");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Cost:" + COST_TRANSPORT_PALLET_CAR * numberOfPallets);
                    System.out.println("-------------------------------------------------");
                }
                break;
            case 3:
                System.out.println("-------------------------------------------------");
                System.out.println("Vaporul este cea mai optima modalitate de transport");
                System.out.println("-------------------------------------------------");
                System.out.println("Cost:" + COST_TRANSPORT_PALLET_SHIP * numberOfPallets);
                System.out.println("-------------------------------------------------");
                break;
            default:
                System.out.println("Nu reprezinta o prioritate");
                System.exit(1);
        }
    }
}
