package sap.springlearning.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sap.springlearning.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
