package thinh.acazia.test.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import thinh.acazia.test.model.Product;
import thinh.acazia.test.model.Products;

import java.util.Optional;

public interface ProductService {
  Page<Product> findALL(Pageable pageable);

  Page<Products> findAll(Pageable pageable);

  Optional<Product> findById(Long id);

  void save(Product product);

  void remove(Long id);

}
