package peaksoft.appplaza.model.entityes;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "MailSenders")
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MailSender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String sender;
    String text;
    @Column(name = "local_date")
    LocalDate localDate;

}
