package peaksoft.appplaza.model.dto;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppRequest {

    String name;
    int age;
    String description;
    String developer;
    String version;
    String genreName;

}
