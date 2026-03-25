package com.web.FirstSpringBootProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.student;

@RestController
public class controller {
	
	//get mapping
	@GetMapping(path = "/welcome" )
	 public String save(@RequestParam (name="query") String name) {
		return "hello from spring boot..!!" + name;
	}
	

	@GetMapping(path = "/test/{q}" )
	 public String test(@PathVariable (name="q") String name) {
		return "hello from spring boot..!!" + name;
	}
	
	//post mapping
	@PostMapping(path = "/testing" )
	 public student testing(@RequestBody student student ) {
		System.out.println(student);
		return student;
	}
	
	//list post mapping
		@PostMapping(path = "/saving" )
		 public List<student> saving(@RequestBody student student ) {
			 student s = new student();
			 s.setId(12);
			 s.setName("diksha");
			 s.setMarks(99);
			 s.setRollnum(1);
			ArrayList<student> list = new ArrayList<student>();
			list.add(student);
			list.add(s);
			
			return list;
			
		}
}
