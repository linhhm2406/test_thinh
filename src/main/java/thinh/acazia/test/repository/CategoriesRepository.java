package thinh.acazia.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thinh.acazia.test.model.Categories;

public interface CategoriesRepository extends PagingAndSortingRepository<Categories, String> {
}
