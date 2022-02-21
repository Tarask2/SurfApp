package pl.project.studia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.project.studia.entity.ProductType;
import pl.project.studia.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    public List<Product> findByProductType(ProductType productType);

}
