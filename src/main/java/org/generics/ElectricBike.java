package org.generics;

public class ElectricBike <T>{
    public T bikeModel;
    public T bikeEngine;
    public T bikeRange;
    public T bikePrice;


    public ElectricBike(){};
    public ElectricBike(T bikeModel, T bikeEngine, T bikeRange, T bikePrice) {
        this.bikeModel = bikeModel;
        this.bikeEngine = bikeEngine;
        this.bikeRange = bikeRange;
        this.bikePrice = bikePrice;
    }


    public T getBikeModel() {
        return bikeModel;
    }

    public void setBikeModel(T bikeModel) {
        this.bikeModel = bikeModel;
    }

    public T getBikeEngine() {
        return bikeEngine;
    }

    public void setBikeEngine(T bikeEngine) {
        this.bikeEngine = bikeEngine;
    }

    public T getBikeRange() {
        return bikeRange;
    }

    public void setBikeRange(T bikeRange) {
        this.bikeRange = bikeRange;
    }

    public T getBikePrice() {
        return bikePrice;
    }

    public void setBikePrice(T bikePrice) {
        this.bikePrice = bikePrice;
    }


    @Override
    public String toString() {
        return "ElectricBike{" +
                "bikeModel=" + bikeModel +
                ", bikeEngine=" + bikeEngine +
                ", bikeRange=" + bikeRange +
                ", bikePrice=" + bikePrice +
                '}';
    }
}
