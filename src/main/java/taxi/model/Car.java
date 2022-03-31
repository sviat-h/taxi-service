package taxi.model;

import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Setter
@Getter
public class Car {
    private Long id;
    @NonNull
    private String model;
    @NonNull
    private Manufacturer manufacturer;
    private List<Driver> drivers = new ArrayList<>();
}
