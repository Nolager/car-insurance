package cl.aosorio.car.insurance.controller;

import cl.aosorio.car.insurance.entity.CarBrand;
import cl.aosorio.car.insurance.service.CarBrandsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarBrandsController {

    private final CarBrandsService carBrandsService;

    public CarBrandsController(CarBrandsService carBrandsService) {
        this.carBrandsService = carBrandsService;
    }

    @GetMapping
    public List<CarBrand> getCars() {
        return carBrandsService.getCars();
    }
}
