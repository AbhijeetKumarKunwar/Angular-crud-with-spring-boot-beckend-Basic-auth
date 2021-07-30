package com.restservice.RestfulwebService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restservice.RestfulwebService.TodosHardCodedService;
import com.restservice.RestfulwebService.bean.Todos;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class TodosResource {

	@Autowired
	private TodosHardCodedService todoService;
	@GetMapping("/users/{userName}/todos")
	public List<Todos>getAllTodos(@PathVariable String userName)
	{
		System.out.println("Get all todos");
		return todoService.findAll();
	}
	@DeleteMapping("/users/todos/{id}") 
	public int  deleteTodo(@PathVariable  long id)
	{
		System.out.println("delete method is called.."+id);
 		int i= this.todoService.deleteById(id);
 		return i;
 		
 
		/*if(i==0)
			return ResponseEntity.noContent().build();
		else
			return ResponseEntity.notFound().build();*/
		
	}
	@GetMapping("/users/todos/{id}")
	public Todos getTodo(@PathVariable long id)
	{
		System.out.print("getTodo by id");
		return todoService.findById(id);
	}
	@PutMapping("/users/todos/{id}")
	public Todos updateTodo(@PathVariable long id, @RequestBody Todos todos)
	{	System.out.println("Update todo");
		return this.todoService.save(todos);
	
	}
	
	@PostMapping("/users/todos/")
	public Todos addTodo(@RequestBody Todos todos)
	{
		return this.todoService.save(todos);
	}
}
