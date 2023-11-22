package carCompany;

public class Mitsubishi extends Car{
    private int justMitsubishi;

    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + " engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + " is eccelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return getName() + " is braking";
    }
}
