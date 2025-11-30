package ir.maktabsharif.library.repository;

import ir.maktabsharif.library.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
