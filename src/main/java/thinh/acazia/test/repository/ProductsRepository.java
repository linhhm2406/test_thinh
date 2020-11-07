package thinh.acazia.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thinh.acazia.test.model.Products;

public interface ProductsRepository extends PagingAndSortingRepository<Products, Long> {
}
