package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDao {
    void saveCar(Car car);
    List<Car> listCars(int maxResult);
}
