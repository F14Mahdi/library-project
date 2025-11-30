package ir.maktabsharif.library.repository;

import ir.maktabsharif.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
