package ir.maktabsharif.library.repository;

import ir.maktabsharif.library.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
