class Car {


    private String brand;
    private String model;
    private double maxSpeed;
    private String color;

    public Car (String brand, String model, double maxSpeed, String color){
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed + 2;
        this.model = model;
    }


    public String getBrand() {
        return brands;
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