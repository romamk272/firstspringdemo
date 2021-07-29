package com.amar.springdemo.repository

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amar.springdemo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

}
