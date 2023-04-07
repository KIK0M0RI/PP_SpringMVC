package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "black", 1));
        cars.add(new Car("BMW", "white", 2));
        cars.add(new Car("BMW", "red", 3));
        cars.add(new Car("BMW", "blue", 4));
        cars.add(new Car("BMW", "purple", 5));
    }

    public List<Car> getCars(int quantity) {
        if (quantity > 0 && quantity < 5) {
            return cars.stream().limit(quantity).collect(Collectors.toList());
        }
        return cars;
    }
}
