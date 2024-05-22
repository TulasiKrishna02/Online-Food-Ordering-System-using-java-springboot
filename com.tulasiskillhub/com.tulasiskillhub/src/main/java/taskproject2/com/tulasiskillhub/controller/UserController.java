package taskproject2.com.tulasiskillhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import taskproject2.com.tulasiskillhub.payload.UsersDto;
import taskproject2.com.tulasiskillhub.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class UserController {
	
	@Autowired(required = true)
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<UsersDto> createUser(@RequestBody UsersDto userDto){
		
		
		return new ResponseEntity<>(userService.createUser(userDto),HttpStatus.CREATED);
	}

}
