package com.maiquelb.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maiquelb.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
