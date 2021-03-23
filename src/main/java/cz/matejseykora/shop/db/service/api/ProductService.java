package cz.matejseykora.shop.db.service.api;

import cz.matejseykora.shop.db.service.api.request.UpdateProductRequest;
import cz.matejseykora.shop.domain.Product;
import org.springframework.lang.Nullable;

import java.util.List;

// CRUD operations listed here
public interface ProductService {
    List<Product> getProducts();

    @Nullable
    Product get(int id);

    @Nullable
    Integer add(Product product); // returns generated id

    @Nullable
    void delete(int id);

    void update(int id, UpdateProductRequest request);
}
