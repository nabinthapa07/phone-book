package com.nabin.phonebook.api.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nabin.phonebook.api.model.Contact;
import com.nabin.phonebook.api.service.ContactService;

@Controller
public class ContactInfoController {
	
	@Autowired
	private ContactService service;

	@GetMapping(value = {"/","/addContact"})
	public String loadForm(Model model) {
		
		Contact c = new Contact();
		model.addAttribute("contact",c);
		return "contactInfo";
	}
	
	@PostMapping("/saveContact")
	public String handleSubmitBtn(@ModelAttribute("contact") Contact contact,Model model) {
		boolean isSaved = service.saveContact(contact);
		if(isSaved) {
			model.addAttribute("successMsg","Successfully saved Contact Details");
		}else {
			model.addAttribute("errorMsg","Failed to save Contact Details");
		}
		return "contactInfo";
		
	}
	
	@GetMapping("/allContacts")
	public String getAllContacts(Model model) {
		List<Contact> contactsSaved = service.getAllContacts();
		model.addAttribute("contacts",contactsSaved);
		return "viewContacts";
	}
	
}
