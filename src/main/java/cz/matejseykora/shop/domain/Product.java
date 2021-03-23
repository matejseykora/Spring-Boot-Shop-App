package cz.matejseykora.shop.domain;


import lombok.*;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.sql.Timestamp;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Product {
    @Nullable
    @Setter(AccessLevel.NONE)
    private Integer id;
    @NonNull
    private int merchant_id;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private double price;
    @NonNull
    private Timestamp createAt;
    @NonNull
    private int available;

    public Product(int merchantId, String name, String description, double price, int available) {
        this.merchant_id = merchantId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = available;
        this.createAt = Timestamp.from(Instant.now());
    }
}
