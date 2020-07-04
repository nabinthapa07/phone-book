package com.nabin.phonebook.api.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nabin.phonebook.api.dao.ContactDtlsRepository;
import com.nabin.phonebook.api.dao.ContactEntity;
import com.nabin.phonebook.api.model.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactDtlsRepository contactDtlRepository;

	@Override
	public boolean saveContact(Contact contact) {
		ContactEntity contactEntity = new ContactEntity();
		BeanUtils.copyProperties(contact, contactEntity);
		ContactEntity savedEntity = contactDtlRepository.save(contactEntity);
		return savedEntity.getContactId()!=null;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getCotactById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer contactId) {
		// TODO Auto-generated method stub
		return false;
	}

}
