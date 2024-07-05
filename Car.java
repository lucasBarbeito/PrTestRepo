class Car {


    private String brand;
    private String model;
    private double maxSpeed;
    private String color;

    public Car (String brand, String model, double maxSpeed, String color){
        this.brand = brand;
        this.colors = colors;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }


    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public String getModel() {
        return model;
    }
}