import java.util.List;
import java.util.ArrayList;
public interface Subject {
    public abstract void registerObserver(Observer o);
    public abstract void removeObserver(Observer o);
    public abstract void notifyObservers();
    public List<Observer> Observers=new ArrayList<Observer>();
}
