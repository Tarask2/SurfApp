package pl.project.studia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.project.studia.entity.ProductType;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Long> {

}
