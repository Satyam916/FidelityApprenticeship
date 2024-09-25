public class HomeTheaterSystem extends SmartTV{
  boolean surroundSound;
  boolean subwoofer;

  HomeTheaterSystem(String brand,String model,int yearOfManufacture,int screenSize,String smartFeatures,boolean surroundSound,boolean subwoofer){
      super(brand,model,yearOfManufacture,screenSize,smartFeatures);
      this.surroundSound = surroundSound;
      this.subwoofer = subwoofer;
  }

  @Override
  public void Display(){
      super.Display();
      System.out.println("Surround Sound: " +(surroundSound?"Enabled":"Disabled"));
      System.out.println("Subwoofer: " +(subwoofer?"Enabled":"Disabled"));

  }

  public void controlAudioSettings(){
      System.out.println("Controlling Home Theater Audio Settings");

  }
}
