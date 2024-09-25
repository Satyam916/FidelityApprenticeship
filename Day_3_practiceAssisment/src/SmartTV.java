public class SmartTV extends MultimediaDevice{
    int screenSize;
    String smartFeatures;

    SmartTV(String brand,String model,int yearOfManufacture,int screenSize,String smartFeatures){
        super(brand,model,yearOfManufacture);
        this.screenSize = screenSize;
        this.smartFeatures=smartFeatures;
    }
    @Override
    public void Display(){
        System.out.println("Screen Size: "+screenSize+"\nSmart Features: "+smartFeatures);
    }

    public void adjustSettings(){
        System.out.println("Adjusting Smart TV settings");
    }
}
