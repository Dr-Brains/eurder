package vercauteren.laurens.eurder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vercauteren.laurens.eurder.domain.repos.UserRepository;

@Service
public class UserService {

	UserRepository userRepository;

	@Autowired
	UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public boolean addUser(){
		return false;
	}
}
