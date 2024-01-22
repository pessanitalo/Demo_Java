package italo.pessan.demo.entities.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import italo.pessan.demo.entities.User;
import italo.pessan.demo.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	private final UserRepository repository;

	public UserController(UserRepository userRepository) {
		this.repository = userRepository;
	}

	@GetMapping
	public List<User> findAll() {
		List<User> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value="/{id}")
	public User getById(@PathVariable Long id) {
		User result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		User result = repository.save(user);
		return result;
	}


}
