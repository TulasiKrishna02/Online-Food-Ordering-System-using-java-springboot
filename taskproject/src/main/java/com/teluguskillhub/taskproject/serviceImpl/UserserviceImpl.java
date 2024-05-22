package com.teluguskillhub.taskproject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teluguskillhub.taskproject.entity.Users;
import com.teluguskillhub.taskproject.payload.UserDto;
import com.teluguskillhub.taskproject.repository.UserRepository;
import com.teluguskillhub.taskproject.service.UserService;


@Service
public class UserserviceImpl implements UserService{
	@Autowired
   private UserRepository userRepository;
	
	
	
	@Override
	public UserDto createUser(UserDto userDto) {
		//userDto is not an entity of users
		Users user=userDtoToEntity(userDto);//converted to userDto to users
		Users savedUser=userRepository.save(user);
		return entityTouserDto(savedUser);
	}
	private Users userDtoToEntity(UserDto userDto) {
		Users users = new Users();
		users.setName(userDto.getName());
		users.setEmail(userDto.getEmail());
		users.setPassword(userDto.getPassword());
		return users;
		
	}
	private UserDto entityTouserDto(Users savedUser) {
		UserDto userDto = new UserDto();
		userDto.setId(savedUser.getId());
		userDto.setEmail(savedUser.getEmail());
		userDto.setPassword(savedUser.getPassword());
		userDto.setName(savedUser.getName());
		return userDto;
	}
	

}
