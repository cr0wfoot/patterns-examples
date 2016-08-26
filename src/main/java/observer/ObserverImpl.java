package observer;

public class ObserverImpl implements Observer {
    
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;
 
    public ObserverImpl(WeatherData data) {
        this.weatherData = data;
        weatherData.registerObserver(this);
    }
 
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
 
    public void display() {
        System.out.printf("Сейчас значения: %.1f градусов цельсия и %.1f %% влажности\n", temperature, humidity);
    }
}
