package kz.springeshop.service;

import kz.springeshop.domain.User;
import kz.springeshop.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService { // security
	boolean save(UserDto userDTO);
	void save(User user);
	List<UserDto> getAll();

	User findByName(String name);
	void updateProfile(UserDto userDTO);
}
