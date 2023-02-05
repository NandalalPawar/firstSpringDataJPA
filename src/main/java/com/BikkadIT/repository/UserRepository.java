package com.BikkadIT.repository;

import org.springframework.data.repository.CrudRepository;

import com.BikkadIT.model.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
