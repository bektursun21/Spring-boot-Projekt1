package peaksoft.appplaza.model.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import peaksoft.appplaza.model.enums.Status;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppResponse {

    Long id;
    String name;
    int age;
    String description;
    String developer;
    String version;
    Status status;
    String genreName;
    LocalDate localDate;
}
