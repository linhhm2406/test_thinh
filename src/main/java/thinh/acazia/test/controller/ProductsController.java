package thinh.acazia.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thinh.acazia.test.model.Product;
import thinh.acazia.test.model.Products;
import thinh.acazia.test.service.ProductService;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public ResponseEntity<Page<Products>> showList(Pageable pageable) {
        Page<Products> products = productService.findAll(pageable);
        if (products.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
