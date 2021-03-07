package FactoryMethodApp;

public class Main {
    public static void main(String[] args) {
        Logistics ship = new SeaLogistics();
        Transport sh = ship.createTransport();
        sh.createTransport();
        ship.planDelivery();



        Logistics truck = new RoadLogistics();
        Transport tr = truck.createTransport();
        tr.createTransport();
        truck.planDelivery();
    }
}

interface Transport {
    void createTransport();
}

class Truck implements Transport{
    public void createTransport() {
        System.out.println("Truck creation...");
        System.out.println("Truck created!");
    }
}

class Ship implements Transport {
    public void createTransport() {
        System.out.println("Ship creation...");
        System.out.println("Ship created!");
    }
}

interface Logistics {
    void planDelivery();
    Transport createTransport();
}

class RoadLogistics implements Logistics{
    public Transport createTransport() {
        return new Truck();
    }
    public void planDelivery() {
        System.out.println("Delivery by Truck");
    }
}

class SeaLogistics implements Logistics{
    public Transport createTransport() {
        return new Ship();
    }
    public void planDelivery() {
        System.out.println("Delivery by ship");
    }
}