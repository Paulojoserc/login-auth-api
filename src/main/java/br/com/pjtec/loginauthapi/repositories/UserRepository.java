package br.com.pjtec.loginauthapi.repositories;

import br.com.pjtec.loginauthapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
