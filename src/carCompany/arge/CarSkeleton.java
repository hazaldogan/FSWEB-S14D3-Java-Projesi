package carCompany.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        System.out.println("ClassName: " + getClass().getSimpleName());
        return getName() + " starting engine.";
    }

    public String drive(){
        System.out.println("ClassName: " + getClass().getSimpleName());
        runEngine(this);
        return getName() + " is driving.";
    }

    protected void runEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.getClass().getSimpleName());
    }
}
