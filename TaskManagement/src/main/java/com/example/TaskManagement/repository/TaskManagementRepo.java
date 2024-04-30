package com.example.TaskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TaskManagement.entity.TaskManagement;

public interface TaskManagementRepo extends JpaRepository<TaskManagement, Integer> {

}
