package ir.maktabsharif.library.repository;

import ir.maktabsharif.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
