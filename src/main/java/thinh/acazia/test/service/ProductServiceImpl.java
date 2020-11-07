package thinh.acazia.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import thinh.acazia.test.model.Product;
import thinh.acazia.test.model.Products;
import thinh.acazia.test.repository.ProductRepository;
import thinh.acazia.test.repository.ProductsRepository;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public Page<Product> findALL(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Products> findAll(Pageable pageable) {
        return productsRepository.findAll(pageable);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }

}
