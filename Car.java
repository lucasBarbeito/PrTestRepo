class Car {


    private String brand;
    private String model;
    private int maxSpeed;
    private String color;

    public Car (String brand, String model, int maxSpeed, String color){
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }


    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getModel() {
        return model;
    }
}