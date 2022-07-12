package kz.springeshop.repositories;

import kz.springeshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	User findFirstByName(String name);
}
