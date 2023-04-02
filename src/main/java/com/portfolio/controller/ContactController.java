package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.playload.ViewerDto;
import com.portfolio.service.ViewerService;
import com.portfolio.playload.ViewerDto;

@RestController
@RequestMapping("/contact")

@CrossOrigin
public class ContactController {
	
	@Autowired
	private ViewerService viewerService;
	
	@PostMapping("/add")
	public ResponseEntity<ViewerDto> createViewer(@RequestBody ViewerDto viewerDto) {
		ViewerDto createdViewer =this.viewerService.createViewer(viewerDto);
		return new ResponseEntity<>(createdViewer ,HttpStatus.OK);
	}

}
