import java.util.Random;
class WeatherData  implements Subject{

  private int temperature;
  private int humidity;
  private int pressure;

  public void registerObserver(Observer o){
    Observers.add(o);
  }
  public void removeObserver(Observer o){
    Observers.remove(o);
  }
  public void notifyObservers(){
  }
  public int getTemperature(){
    return temperature;
  }
  public int getHumidity(){
    return humidity;
  }
  public int getPressure(){
    return pressure;
  }
  public void measurementsChanged(){
    Random r=new Random();
    temperature=r.nextInt(50);
    humidity=r.nextInt(50);
    pressure=r.nextInt(50);
  }
}
