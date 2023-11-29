package peaksoft.appplaza.model.dto;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegistrationRequest {

    String name;
    String lastName;
    String email;
    int age;
    boolean subscribe;
}
