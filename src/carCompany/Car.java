package carCompany;

import java.util.Objects;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine=true;
        this.wheels= 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        System.out.println("ClassName: " + getClass().getSimpleName());
        return "The car engine is starting";
    }
    public String accelerate(){
        System.out.println("ClassName: " + getClass().getSimpleName());
        return "The car ,s Accelerating";
    }
    public String brake(){
        System.out.println("ClassName: " + getClass().getSimpleName());
        return "The car is braking";
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

}
