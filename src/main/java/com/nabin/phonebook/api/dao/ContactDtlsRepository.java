package com.nabin.phonebook.api.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDtlsRepository extends JpaRepository<ContactEntity, Serializable> {
	//primary key can be of any data type so used serilizable

}
