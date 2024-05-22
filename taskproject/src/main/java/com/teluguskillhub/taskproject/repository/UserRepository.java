package com.teluguskillhub.taskproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teluguskillhub.taskproject.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
