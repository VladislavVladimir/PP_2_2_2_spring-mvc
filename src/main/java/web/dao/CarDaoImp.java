package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars;
    private static int CARS_COUNT;

    {
        cars = new ArrayList<>();
        saveCar(new Car( "BMV", "Black", 145));
        saveCar(new Car( "Toyota", "Blue", 125));
        saveCar(new Car( "Nissan", "White", 110));
        saveCar(new Car( "КАМАЗ", "Красненький", 180));
        saveCar(new Car( "Лада", "Малиновая", 240));
    }

    @Override
    public void saveCar(Car car) {
        cars.add(car.setId(++CARS_COUNT) );
    }

    @Override
    public List<Car> listCars(int maxResult) {
        if (maxResult > cars.size() || maxResult < 1) {
            maxResult = cars.size();
        }
        return cars.subList(0, maxResult);
    }
}
