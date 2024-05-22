package taskproject2.com.tulasiskillhub.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import taskproject2.com.tulasiskillhub.entity.Users;
import taskproject2.com.tulasiskillhub.payload.UsersDto;
import taskproject2.com.tulasiskillhub.repository.UserRepository;
import taskproject2.com.tulasiskillhub.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UsersDto createUser(UsersDto usersDto) {
		//userDto is not a entity of users
		
		Users user=userDtoEntity(usersDto);//converted userDto to users
		Users saveduser=userRepository.save(user);
		return entityToUserDto(saveduser);
	}
	
	private Users userDtoEntity(UsersDto userDto) {
		
		Users users=new Users();
	     users.setName(userDto.getName());
	     users.setEmail(userDto.getEmail());
	     users.setPassword(userDto.getPassword());
		return users;	
	}
	private UsersDto entityToUserDto(Users saveduser) {
		
		UsersDto usersDto=new UsersDto();
		
		usersDto.setId(saveduser.getId());
		usersDto.setEmail(saveduser.getEmail());
		usersDto.setPassword(saveduser.getPassword());
		usersDto.setName(saveduser.getName());
		
		return usersDto;
	}

}
