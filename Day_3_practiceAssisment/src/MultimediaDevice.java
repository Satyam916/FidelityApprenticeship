public class MultimediaDevice {
    String brand;
    String model;
    int yearOfManufacture;

    MultimediaDevice(String brand, String model, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }
    public void Display(){
        System.out.println("Brand: " + brand+"\nModel: " + model+"\nyear of manufacture: " + yearOfManufacture);
    }
}
