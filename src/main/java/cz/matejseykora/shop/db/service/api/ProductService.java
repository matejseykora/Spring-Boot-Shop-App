package cz.matejseykora.shop.db.service.api;

import cz.matejseykora.shop.domain.Product;
import org.springframework.lang.Nullable;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    @Nullable
    Product get(int id);

    @Nullable
    Integer add(Product product); // returns generated id
}
