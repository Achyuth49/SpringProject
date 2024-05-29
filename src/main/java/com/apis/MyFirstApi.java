package com.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstApi {
	
	
	
	@GetMapping("/wish")
	public String sayWish() {
		
		return "Welcome";
	}
	
	@GetMapping("/wish/{username}")
	public String sayCusName(@PathVariable("username") String cusName) {
		
		return "Welcome "+cusName;
	}
	
	@GetMapping("/wish2/{username}")
	public String sayCusNameWithWife(@PathVariable("username") String cusName,
			@RequestParam(name="wifeName",required=false) String wifeName) {
		
		return "Welcome "+cusName+" and wife "+wifeName;
	}
	
	@PostMapping("/create")
	public String createUser(@RequestBody InstagramUser userObj) {
		
		System.out.println("User data is "+userObj);
		
		return "User Created Successfully";
	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody InstagramUser userObj) {
		
		System.out.println("User data is "+userObj);
		
		return "User updated Successfully";
	}
	
	@PatchMapping("/update2")
	public String updateUserSpecific(@RequestBody InstagramUser userObj) {
		
		System.out.println("User data is "+userObj);
		
		return "User updated Successfully";
	}
	
	@DeleteMapping("/delete/{userId}")
	public String deleteUser(@PathVariable("userId") int userId) {
		
		System.out.println("deleted user id "+userId);
		
		return "User deleted Successfully";
	}

}
