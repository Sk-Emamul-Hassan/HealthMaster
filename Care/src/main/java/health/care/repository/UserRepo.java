package health.care.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import health.care.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Integer> {
	

}
