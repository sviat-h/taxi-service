package taxi.model;

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
public class Driver {
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String licenseNumber;
    @NonNull
    private String login;
    @NonNull
    private String password;
}
