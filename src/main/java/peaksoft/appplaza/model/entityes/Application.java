package peaksoft.appplaza.model.entityes;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import peaksoft.appplaza.model.enums.Status;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "applications")
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    int age;
    String description;
    String developer;
    String version;
    @Enumerated(EnumType.STRING)
    Status status;
    @Column(name = "genre_name")
    String genreName;
    @Column(name = "local_date")
    LocalDate localDate;

    @ManyToMany(cascade = CascadeType.ALL,
            mappedBy = "applications")
    List<User> users;

    @Transient
    Long genreId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "genres_id")
    Genre genres;
}
