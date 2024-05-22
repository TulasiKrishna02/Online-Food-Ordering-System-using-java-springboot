package taskproject2.com.tulasiskillhub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import taskproject2.com.tulasiskillhub.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
	public List<Task> findAllByUsersId(long userid);

}
