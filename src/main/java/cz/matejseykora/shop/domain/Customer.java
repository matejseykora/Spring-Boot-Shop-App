package cz.matejseykora.shop.domain;

import lombok.*;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Customer {
    @Nullable
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String surname;
    @NonNull
    private String email;
    @NonNull
    private String address;
    @Nullable
    private Integer age;
    @Nullable
    private String phoneNumber;
}
