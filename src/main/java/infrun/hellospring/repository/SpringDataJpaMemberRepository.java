package infrun.hellospring.repository;

import infrun.hellospring.domain.Member;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>,
        MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}