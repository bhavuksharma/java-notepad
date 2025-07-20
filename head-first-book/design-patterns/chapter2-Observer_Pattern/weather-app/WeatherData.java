import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observersList;
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

    public WeatherData(){
        this.observersList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observersList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observersList){
            // observer.update(temperature, humidity, pressure);
            observer.update();
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
}
