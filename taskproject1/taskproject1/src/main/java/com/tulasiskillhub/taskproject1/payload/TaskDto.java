package com.tulasiskillhub.taskproject1.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaskDto {
	private long id;
	private String taskname;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	
	

}