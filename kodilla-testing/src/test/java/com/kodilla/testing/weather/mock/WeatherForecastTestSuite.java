package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;
    private Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeEach
    void start() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Map<String, Double> map = weatherForecast.calculateForecast();
        double av = 0;
        for (Map.Entry<String, Double> temp :
                map.entrySet()) {
            av += temp.getValue();
        }
        av /= map.size();

        //Then
        Assertions.assertEquals(26.560000000000002, av);
    }

    @Test
    void testMedianWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        double median;

        //When
        Map<String, Double> map = weatherForecast.calculateForecast();
        List<Double> sorted = map.values().stream().sorted().collect(Collectors.toList());

        if (sorted.size() % 2 == 1)
            median = sorted.get(sorted.size() / 2 + 1);
        else {
            median = .5 * (sorted.get(sorted.size() / 2) + sorted.get(sorted.size() / 2 + 1));
        }

        //Then
        Assertions.assertEquals(27.1, median);
    }
}