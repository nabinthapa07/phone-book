package com.nabin.phonebook.api.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nabin.phonebook.api.dao.ContactDtlsRepository;
import com.nabin.phonebook.api.dao.ContactEntity;
import com.nabin.phonebook.api.model.Contact;

@Service
@Transactional
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
		
		List<ContactEntity> entities = contactDtlRepository.findAll();

		//legacy approach
		//List<Contact> contacts = new ArrayList<Contact>();

//		for(ContactEntity entity : entities ) {
//			Contact contact = new Contact();
//			BeanUtils.copyProperties(entity, contact);
//			contacts.add(contact);
//		}
		
		//java 8 approach
//		List<Contact> contacts = entities.stream().map(entity ->{
//			Contact contact = new Contact();
//			BeanUtils.copyProperties(entity, contact);
//			return contact;
//		}).collect(Collectors.toList());
		
		
		return entities.stream().map(entity ->{
			Contact contact = new Contact();
			BeanUtils.copyProperties(entity, contact);
			return contact;
		}).collect(Collectors.toList());
	}

	@Override
	public Contact getCotactById(Integer id) {
		
		Optional<ContactEntity> findById = contactDtlRepository.findById(id);
		if(findById.isPresent()) {
		ContactEntity contactEntity = findById.get();
		Contact contact = new Contact();
		BeanUtils.copyProperties(contactEntity, contact);
		return contact;
		}
		
		return null;
	}

	@Override
	public boolean deleteContact(Integer contactId) {
		contactDtlRepository.deleteById(contactId);
		return true;
	}

	
	

}
