package com.teluguskillhub.taskproject.service;

import java.util.List;

import com.teluguskillhub.taskproject.payload.TaskDto;

public interface TaskService {
	
	public TaskDto saveTask(long userid,TaskDto taskdto);
	
	public List<TaskDto> getAllTasks(long userid);

}
