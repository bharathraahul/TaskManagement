package com.example.TaskManagementServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TaskManagement.entity.TaskManagement;
import com.example.TaskManagement.repository.TaskManagementRepo;
import com.example.TaskManagement.service.TaskManagementService;



@Service
public class TaskManagementServiceImpl implements TaskManagementService {

	@Autowired
	TaskManagementRepo repo;
	
	@Override
	public TaskManagement createManagement(TaskManagement taskManagement) {
		// TODO Auto-generated method stub
		return repo.save(taskManagement);
	}

	@Override
	public List<TaskManagement> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskManagement getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

}
