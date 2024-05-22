package taskproject2.com.tulasiskillhub.repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import taskproject2.com.tulasiskillhub.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	
	//public Optional<Users> findByEmail(String email);

}
