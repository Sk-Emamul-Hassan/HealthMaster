package health.care.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import health.care.entity.UserEntity;
import health.care.serviceprocess.UserServiceProcess;

@RestController("/user")
public class UserBrowser {
	@Autowired
	UserServiceProcess userService;
	@GetMapping("/allusers")
	public ResponseEntity<List<UserEntity>>  getAllUsers(){
		List<UserEntity> allUsers=userService.getAllUserDetails();
		return new ResponseEntity<List<UserEntity>>(allUsers,HttpStatus.OK);
	}

}
