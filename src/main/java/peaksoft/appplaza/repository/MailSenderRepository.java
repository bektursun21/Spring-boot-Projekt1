package peaksoft.appplaza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.appplaza.model.entityes.MailSender;

@Repository
public interface MailSenderRepository extends JpaRepository<MailSender, Long> {
}
