package ir.maktabsharif.library.repository;

import ir.maktabsharif.library.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Long> {
}
