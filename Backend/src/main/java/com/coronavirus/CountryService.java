package com.coronavirus;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository repo;
	
	public List<Country> listAll(){
		return repo.findAll();
	}
	
	public void save(Country countries) {
		repo.save(countries);
	}
	
	public Country get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
