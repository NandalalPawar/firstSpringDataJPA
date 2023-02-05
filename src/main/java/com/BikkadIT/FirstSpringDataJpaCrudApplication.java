package com.BikkadIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.model.UserEntity;
import com.BikkadIT.repository.UserRepository;

@SpringBootApplication
public class FirstSpringDataJpaCrudApplication {

		public static void main(String[] args) {
			ConfigurableApplicationContext context = SpringApplication.run(FirstSpringDataJpaCrudApplication.class, args);
		 
			UserRepository repository = context.getBean(UserRepository.class);
		
			UserEntity userEntity=new UserEntity();
			
//			userEntity.setUserId(4);
//			userEntity.setUserName("jitendra");
//			userEntity.setUserEmail("jiten212@gmail.com");
//			userEntity.setAge(29);
//			
//			repository.save(userEntity);
//			
			UserEntity userEntity1=new UserEntity();
			userEntity1.setUserId(5);
			userEntity1.setUserName("jktyyy");
			userEntity1.setUserEmail("fjkfjjf127@gmail.com");
			userEntity1.setAge(33);		
	
//			
//			UserEntity userEntity2=new UserEntity();
//			userEntity2.setUserId(6);
//			userEntity2.setUserName("jfdjf");
//			userEntity2.setUserEmail("djdjs@gmail.com");
//			userEntity2.setAge(33);
//			
			List<UserEntity> list=new ArrayList<>();
			list.add(userEntity1);
	//		list.add(userEntity2);
//			
			repository.saveAll(list);
//
//			 Optional<UserEntity> user= repository.findById(2);
//			System.out.println(user);
//			
//			Iterable<UserEntity> findAll = repository.findAll();
//			for(UserEntity list1:findAll) {
//				System.out.println(list1);
//			}
//			List<Integer> list1 = Arrays.asList(2,6);
//			  Iterable<UserEntity> findAllById = repository.findAllById(list1);
//			  System.out.println(findAllById);
//			  for(UserEntity fid:findAllById) {
//				  System.out.println(fid);
//			  }
//			  boolean existsById = repository.existsById(8);
//				System.out.println(existsById);
//
//				long count = repository.count();
//				System.out.println(count);
//				repository.deleteById(5);
//				
//				UserEntity userentity=new UserEntity();
//				 userentity.setUserId(8);
//				 repository.delete(userentity);
//				 
//				 List l=new ArrayList();
//					l.add(5);
//					l.add(2);
//					repository.deleteAllById(l);
//					

					UserEntity u1 = new UserEntity();
					u1.setUserId(3);
			
				UserEntity u2 = new UserEntity();
					u2.setUserId(7);
			
//				List ll = new ArrayList();
//					ll.add(u1);
//					ll.add(u2);
//								repository.deleteAll(ll);
//
//					
//					repository.deleteAll();
//					
		}
}
