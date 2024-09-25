public class BasicMediaPlayer extends MultimediaDevice{
    String supportedFormats;

    BasicMediaPlayer(String brand,String model,int yearOfManufacture,String supportedFormats){
        super(brand,model,yearOfManufacture);
        this.supportedFormats=supportedFormats;
    }

    @Override
    public void Display(){
        super.Display();
        System.out.println("Supported Formats:"+supportedFormats);

    }

    public void play(){
        System.out.println("Playing media on Basic Media Player");
    }
}
