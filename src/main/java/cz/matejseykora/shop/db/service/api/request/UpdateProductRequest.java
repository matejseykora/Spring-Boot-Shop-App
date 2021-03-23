package cz.matejseykora.shop.db.service.api.request;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.lang.NonNull;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class UpdateProductRequest {

    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private double price;
    @NonNull
    private int available;
}
