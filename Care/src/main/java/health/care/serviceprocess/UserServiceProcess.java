package health.care.serviceprocess;

import java.util.List;

import org.springframework.stereotype.Service;

import health.care.entity.UserEntity;

@Service
public interface UserServiceProcess {

	List<UserEntity> getAllUserDetails();

}
