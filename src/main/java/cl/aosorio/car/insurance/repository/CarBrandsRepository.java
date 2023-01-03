package cl.aosorio.car.insurance.repository;

import cl.aosorio.car.insurance.entity.CarBrand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarBrandsRepository extends CrudRepository<CarBrand, Integer> {
    List<CarBrand> findAll();
    Optional<CarBrand> findById(Integer id);
}