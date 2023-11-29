package peaksoft.appplaza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.appplaza.model.entityes.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
