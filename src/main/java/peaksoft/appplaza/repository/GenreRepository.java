package peaksoft.appplaza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.appplaza.model.entityes.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
