package org.example;

public abstract class AbstractVehicule {
    private final String name;
    public enum VehiculeType {
        CAR("Car"),
        PLANE("Plane"),
        BOAT("Boat");
        private final String type;
        VehiculeType(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }
    }

    protected AbstractVehicule(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract double getSpeed() {

    }

    public String toString() {
        return String.format("AbstractVehicule: {name: %s, speed: %f}", this.getName(), this.getSpeed());
    }

    public abstract void move() {

    }

    public String getType() {

    }
}
