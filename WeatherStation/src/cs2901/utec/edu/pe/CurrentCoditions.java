public class CurrentCoditions implements Observer,DisplayElement{

    public WeatherData subject=new WeatherData();
    @Override
    public void update() {
    }
    public void display(){
      System.out.println(subject.getTemperature());
      System.out.println(subject.getHumidity());
    }
}
