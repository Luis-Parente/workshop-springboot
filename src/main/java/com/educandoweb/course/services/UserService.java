package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepositories;

@Service
public class UserService {

	@Autowired
	private UserRepositories repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findyId(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
				}
}
