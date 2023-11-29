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
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @Column(name = "last_name")
    String lastName;
    String email;
    boolean subscribe;
    int age;
    @Enumerated(EnumType.STRING)
    Status status;
    LocalDate createDate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "users_application",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "application_id"))
    List<Application> applications;
}
