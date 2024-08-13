package demo.demo.bank.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // select * from user where username = ?
    Optional<User> findByUsername(String username);

}
