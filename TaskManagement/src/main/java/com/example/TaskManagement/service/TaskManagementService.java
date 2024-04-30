package com.example.TaskManagement.service;

import java.util.List;

import com.example.TaskManagement.entity.TaskManagement;



public interface TaskManagementService {

	List<TaskManagement> getAll();

	TaskManagement getById(int id);

	TaskManagement createManagement(TaskManagement taskManagement);

}
