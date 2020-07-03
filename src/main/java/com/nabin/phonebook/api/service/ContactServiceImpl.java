package com.nabin.phonebook.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nabin.phonebook.api.model.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	@Override
	public boolean saveContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
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
