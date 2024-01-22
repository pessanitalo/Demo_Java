package italo.pessan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import italo.pessan.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}