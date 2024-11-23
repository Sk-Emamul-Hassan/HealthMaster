package health.care.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import health.care.entity.UserEntity;
import health.care.repository.UserRepo;
import health.care.serviceprocess.UserServiceProcess;

@Service
public class UserService implements UserServiceProcess {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public List<UserEntity> getAllUserDetails() {
		
		return userRepo.findAll();
	}

}
