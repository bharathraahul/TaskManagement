package com.example.TaskManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TaskManagement.entity.TaskManagement;
import com.example.TaskManagement.service.TaskManagementService;
import com.example.TaskManagementServiceImpl.TaskManagementServiceImpl;

@RestController
@RequestMapping("/taskmanagement")
public class TaskManagementController {

	@Autowired
	TaskManagementService taskmanagerservice;
	
	
	@PostMapping(value="post")
	ResponseEntity<TaskManagement> addTask(TaskManagement taskManagement){
		TaskManagement task1 = taskmanagerservice.createManagement(taskManagement);
		
		return new ResponseEntity<TaskManagement>(task1,HttpStatus.OK);
	}
	

}
