package com.coronavirus;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	 @Autowired
	 private CountryService service;

	 @GetMapping("/countries")
	 public List<Country> list() { 
		 return service.listAll();
	 }
	 
	 @GetMapping("/countries/{id}")
	 public ResponseEntity<Country> get(@PathVariable Integer id) {
		 try {
			 Country country = service.get(id);
			 return new ResponseEntity<Country>(country, HttpStatus.OK);
		 }
		 catch(NoSuchElementException e) {
			 return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
		 }
	 }  
	 
	 @PostMapping("/countries")
	 public void add(@RequestBody Country country) {
		 service.save(country);
	 }
	 
}
