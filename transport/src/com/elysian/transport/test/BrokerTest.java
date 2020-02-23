package com.elysian.transport.test;

import com.elysian.transport.logic.Broker;
import com.elysian.transport.logic.DefaultCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrokerTest {
    Broker testBroker;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        testBroker = new Broker();
        testBroker.setCostCalculator(new DefaultCalculator());
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        testBroker = null;
    }

    @Test
    void Should_ReturnHelicopter_When_VeryUrgentAndOnePallet() {
        int noOfPallets = 1;
        int prio = 0;
        String expectedResult = setExpectedString("Elicopterul", 1000, noOfPallets, 250);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnPlane_When_UrgentAndOnePallet(){
        int noOfPallets = 1;
        int prio = 1;
        String expectedResult = setExpectedString("Avionul", 800, noOfPallets, 200);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnCar_When_NormalAndOnePallet(){
        int noOfPallets = 1;
        int prio = 2;
        String expectedResult = setExpectedString("Masina", 500, noOfPallets, 100);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnCar_When_CheapAndOnePallet(){
        int noOfPallets = 1;
        int prio = 3;
        String expectedResult = setExpectedString("Masina", 500, noOfPallets, 100);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnTruck_When_VeryUrgentAndTwoPallets(){
        int noOfPallets = 2;
        int prio = 0;
        String expectedResult = setExpectedString("Tirul", 400, noOfPallets, 150);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnTruck_When_VeryUrgentAnd25Pallets(){
        int noOfPallets = 25;
        int prio = 0;
        String expectedResult = setExpectedString("Tirul", 400, noOfPallets, 150);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnTruck_When_VeryUrgentAnd50Pallets(){
        int noOfPallets = 50;
        int prio = 0;
        String expectedResult = setExpectedString("Tirul", 400, noOfPallets, 150);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnTruck_When_UrgentAndTwoPallets(){
        int noOfPallets = 2;
        int prio = 1;
        String expectedResult = setExpectedString("Tirul", 400, noOfPallets, 150);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnTruck_When_UrgentAnd25Pallets(){
        int noOfPallets = 25;
        int prio = 1;
        String expectedResult = setExpectedString("Tirul", 400, noOfPallets, 150);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnTruck_When_UrgentAnd50Pallets(){
        int noOfPallets = 50;
        int prio = 1;
        String expectedResult = setExpectedString("Tirul", 400, noOfPallets, 150);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnTrain_When_NormalAndTwoPallets(){
        int noOfPallets = 2;
        int prio = 2;
        String expectedResult = setExpectedString("Trenul", 250, noOfPallets, 75);
        assertEquals(testBroker.getBestTransport(noOfPallets,prio), expectedResult);
    }

    @Test
    void Should_ReturnTrain_When_NormalAnd25Pallets(){
        int noOfPallets = 25;
        int prio = 2;
        String expectedResult = setExpectedString("Trenul", 250, noOfPallets, 75);
        assertEquals(testBroker.getBestTransport(noOfPallets,prio), expectedResult);
    }

    @Test
    void Should_ReturnTrain_When_NormalAnd50Pallets(){
        int noOfPallets = 50;
        int prio = 2;
        String expectedResult = setExpectedString("Trenul", 250, noOfPallets, 75);
        assertEquals(testBroker.getBestTransport(noOfPallets,prio), expectedResult);
    }

    @Test
    void Should_ReturnTrain_When_CheapAndTwoPallets(){
        int noOfPallets = 2;
        int prio = 2;
        String expectedResult = setExpectedString("Trenul", 250, noOfPallets, 75);
        assertEquals(testBroker.getBestTransport(noOfPallets,prio), expectedResult);
    }

    @Test
    void Should_ReturnTrain_When_CheapAnd25Pallets(){
        int noOfPallets = 25;
        int prio = 2;
        String expectedResult = setExpectedString("Trenul", 250, noOfPallets, 75);
        assertEquals(testBroker.getBestTransport(noOfPallets,prio), expectedResult);
    }

    @Test
    void Should_ReturnTrain_When_CheapAnd50Pallets(){
        int noOfPallets = 50;
        int prio = 2;
        String expectedResult = setExpectedString("Trenul", 250, noOfPallets, 75);
        assertEquals(testBroker.getBestTransport(noOfPallets,prio), expectedResult);
    }

    @Test
    void Should_ReturnShip_When_VeryUrgentAnd51Pallets(){
        int noOfPallets = 51;
        int prio = 0;
        String expectedResult = setExpectedString("Vaporul", 150, noOfPallets, 50);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnShip_When_VeryUrgentAnd100Pallets(){
        int noOfPallets = 100;
        int prio = 0;
        String expectedResult = setExpectedString("Vaporul", 150, noOfPallets, 50);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnShip_When_UrgentAnd51Pallets(){
        int noOfPallets = 51;
        int prio = 1;
        String expectedResult = setExpectedString("Vaporul", 150, noOfPallets, 50);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnShip_When_UrgentAnd100Pallets(){
        int noOfPallets = 100;
        int prio = 1;
        String expectedResult = setExpectedString("Vaporul", 150, noOfPallets, 50);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnShip_When_NormalAnd51Pallets(){
        int noOfPallets = 51;
        int prio = 2;
        String expectedResult = setExpectedString("Vaporul", 150, noOfPallets, 50);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnShip_When_NormalAnd100Pallets(){
        int noOfPallets = 100;
        int prio = 2;
        String expectedResult = setExpectedString("Vaporul", 150, noOfPallets, 50);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnShip_When_CheapAnd51Pallets(){
        int noOfPallets = 51;
        int prio = 3;
        String expectedResult = setExpectedString("Vaporul", 150, noOfPallets, 50);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnShip_When_CheapAnd100Pallets(){
        int noOfPallets = 100;
        int prio = 3;
        String expectedResult = setExpectedString("Vaporul", 150, noOfPallets, 50);
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), expectedResult);
    }

    @Test
    void Should_ReturnNoPrioMessage_When_WrongPrio(){
        int noOfPallets = 51;
        int prio = 5;
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), "Nu reprezinta o prioritate");
    }

    @Test
    void Should_ReturnInvalidNoOfPallets_When_0Pallets(){
        int noOfPallets = 0;
        int prio = 0;
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), "Numar de paleti invalid!");
    }

    @Test
    void Should_ReturnInvalidNoOfPallets_When_NegativePallets(){
        int noOfPallets = -2;
        int prio = 0;
        assertEquals(testBroker.getBestTransport(noOfPallets, prio), "Numar de paleti invalid!");
    }

    private String setExpectedString(String transportName, final int transportCost, final int noOfPallets, final int palletCost){
        return transportName + " este cea mai optima modalitate de transport. Cost: " + (transportCost + noOfPallets * palletCost);
    }
}