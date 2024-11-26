package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    void saveCar(Car car);
    List<Car> listCars(int maxResult);
}
