package cl.aosorio.car.insurance.controller;

import cl.aosorio.car.insurance.entity.CarBrand;
import cl.aosorio.car.insurance.entity.graphql.CarBrandInput;
import cl.aosorio.car.insurance.repository.CarBrandsRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class CarBrandsGraphQlController {

    private final CarBrandsRepository carBrandsRepository;

    public CarBrandsGraphQlController(CarBrandsRepository carBrandsRepository) {
        this.carBrandsRepository = carBrandsRepository;
    }

    @QueryMapping(name = "carBrands")
    List<CarBrand> cars() {
        return carBrandsRepository.findAll();
    }

    @QueryMapping
    Optional<CarBrand> carBrandById(@Argument Integer id) {
        return carBrandsRepository.findById(id);
    }

    @MutationMapping
    CarBrand addCar(@Argument CarBrandInput carBrand) {

        CarBrand car = new CarBrand();
        car.setName(carBrand.getName());

        return carBrandsRepository.save(car);
    }
}
