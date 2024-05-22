package com.teluguskillhub.taskproject.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teluguskillhub.taskproject.entity.Task;
import com.teluguskillhub.taskproject.entity.Users;
import com.teluguskillhub.taskproject.exception.UserNotFound;
import com.teluguskillhub.taskproject.payload.TaskDto;
import com.teluguskillhub.taskproject.repository.TaskRepository;
import com.teluguskillhub.taskproject.repository.UserRepository;
import com.teluguskillhub.taskproject.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	public ModelMapper modelMapper;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TaskRepository taskRepository;
	

	@Override
	public TaskDto saveTask(long userid, TaskDto taskDto) {
		Users user=userRepository.findById(userid).orElseThrow(
				()->new UserNotFound(String.format("User id %d not found", userid))
				
				);
		Task task=modelMapper.map(taskDto,Task.class);
		task.setUsers(user);
		//After setting the user,we are storing the data in db
		Task savedTask=taskRepository.save(task);
		
		
		return modelMapper.map(savedTask, TaskDto.class);
	}

	@Override
	public List<TaskDto> getAllTasks(long userid) {
		// TODO Auto-generated method stub
		return null;
	}

}
