package com.nm.hibernate.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nm.hibernate.model.Parent;
import com.nm.hibernate.service.ParentService;

@RestController
public class ParentController {
	
	@Autowired
	private ParentService testService;
	
	@RequestMapping("/")
	public ResponseEntity<List<Parent>> test() {
		List<Parent> result = testService.test();
		return new ResponseEntity<List<Parent>>(result, HttpStatus.OK);
	}

}
