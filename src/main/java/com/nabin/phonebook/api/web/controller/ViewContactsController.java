package com.nabin.phonebook.api.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nabin.phonebook.api.model.Contact;
import com.nabin.phonebook.api.service.ContactService;

@Controller
public class ViewContactsController {
	
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/editContact")
	public String getContactById(@RequestParam("cId") Integer contactId,Model model) {
		
		Contact contactRetrieved = contactService.getCotactById(contactId);
		model.addAttribute("contact", contactRetrieved);
		return "contactInfo";
	}
	
	
	
	

}
