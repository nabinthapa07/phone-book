package com.nabin.phonebook.api.service;

import java.util.List;

import com.nabin.phonebook.api.model.Contact;

public interface ContactService {
	
	public boolean saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getCotactById(Integer id);
	
	public boolean updateContact(Contact contact);
	
	public boolean deleteContact(Integer contactId);

}
