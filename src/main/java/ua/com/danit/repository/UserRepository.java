package ua.com.danit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.danit.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByLastNameIgnoreCase(String firstName);
}
