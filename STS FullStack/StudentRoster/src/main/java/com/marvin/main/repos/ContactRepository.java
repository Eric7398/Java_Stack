package com.marvin.main.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marvin.main.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long>{
    List<Contact> findAll();
}
