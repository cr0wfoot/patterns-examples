package observer;

public class Run {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer firstObserver = new ObserverImpl(weatherData);
        Observer secondObserver = new ObserverImpl(weatherData);

        weatherData.setMeasurements(29, 65, 30.4f);
        weatherData.setMeasurements(39, 70, 29.4f);
        weatherData.setMeasurements(42, 72, 31.4f);
    }
}
