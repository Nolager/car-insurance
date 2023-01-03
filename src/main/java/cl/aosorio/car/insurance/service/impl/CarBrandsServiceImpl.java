package cl.aosorio.car.insurance.service.impl;

import cl.aosorio.car.insurance.entity.CarBrand;
import cl.aosorio.car.insurance.repository.CarBrandsRepository;
import cl.aosorio.car.insurance.service.CarBrandsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarBrandsServiceImpl implements CarBrandsService {

    private final CarBrandsRepository carBrandsRepository;

    public CarBrandsServiceImpl(CarBrandsRepository carBrandsRepository) {
        this.carBrandsRepository = carBrandsRepository;
    }

    @Override
    public List<CarBrand> getCars() {
        return carBrandsRepository.findAll();
    }
}
