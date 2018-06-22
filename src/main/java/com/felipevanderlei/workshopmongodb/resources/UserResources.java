package com.felipevanderlei.workshopmongodb.resources;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipevanderlei.workshopmongodb.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	
	//@RequestMapping(method=RequestMethod.GET)
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Brown", "maria@gmail.com");
		User alex = new User("2", "Alex Green", "alex@gmail.com");
		
		/*
		 * Em Java List é apenas uma interface, e não pode ser instanciada.
		 * Para isso, é necessário uma implementação da inteface.
		 * Assim, como o ArrayList é uma implementação da List, 
		 * é então necessária a sua declaração.
		 */
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}
}
