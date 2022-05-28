package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import java.util.*;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(BootjpaexampleApplication.class, args);
		System.out.println("Hello !!!!");
		
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		User user1=new User();
		User user2=new User();
		User user3=new User();
		//user.setId(0);
//		user.setName("Mona");
//		user.setCity("Jhansi");
//		user.setStatus("Active");
//		
//		userRepository.save(user);
//		System.out.println(user);
		
		//Save multiple users
		
//	    
//	    user1.setName("Mona");
//		user1.setCity("Jhansi");
//		user1.setStatus("Java");
//		
//	    user2.setName("AgrawalGoyal");
//		user2.setCity("UP");
//		user2.setStatus("I am Python Developer");
//		
//		
//	    user3.setName("Minki");
//		user3.setCity("Orai");
//		user3.setStatus("Hey!! Springboot web developer");
//		
//		java.util.List<User> users=List.of(user1,user2,user3);
//		
//		Iterable<User> result=userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		
		//Update the user of ID 9
		
		Optional<User> optional=userRepository.findById(7);
		
		User user=optional.get();
		user.setName("Minki Agrawal");
		userRepository.save(user);
		
		System.out.println(user);
		
		//How to get data from database
		//findById(id)-return Optional containing your data
		
		Iterable<User> itr=userRepository.findAll();
		itr.forEach(userFetch->{
			System.out.println(userFetch);
		});
		
		//Deleting the user element
		//userRepository.deleteById(8);
		
		//Delete all the elements
		userRepository.deleteAll();
		
		
		
	}

}
