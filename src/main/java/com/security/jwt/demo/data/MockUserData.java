package com.security.jwt.demo.data;

import java.util.Arrays;
import java.util.List;

import com.security.jwt.demo.models.Role;
import com.security.jwt.demo.models.RoleType;
import com.security.jwt.demo.models.User;
import com.security.jwt.demo.repository.RoleRepository;
import com.security.jwt.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockUserData implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		List<Role> roles = Arrays.asList(
				new Role(null, RoleType.ROLE_ADMIN),
				new Role(null, RoleType.ROLE_USER)
				);
		List<User> users = Arrays.asList(
				new User(null, "admin", "admin", "Abhishek Shah", "test@email.com", Arrays.asList(roles.get(0))),
				new User(null, "user", "user", "John Dow", "john@gmail.com", Arrays.asList(roles.get(1)))
				);
		
		this.roleRepository.save(roles);
		
		this.userRepository.save(users);
	}

}
