package peaksoft.appplaza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.appplaza.model.entityes.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
