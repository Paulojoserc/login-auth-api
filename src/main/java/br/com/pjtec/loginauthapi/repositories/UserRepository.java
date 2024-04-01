package br.com.pjtec.loginauthapi.repositories;

import br.com.pjtec.loginauthapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
