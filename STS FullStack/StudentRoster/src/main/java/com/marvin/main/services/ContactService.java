package com.marvin.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marvin.main.models.Contact;
import com.marvin.main.repos.ContactRepository;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepo;

        // ------------- SHOW ALL CONTACTS ------------- // 
    public List<Contact> showAllContacts() {

        return contactRepo.findAll();
    }


    // -------------- FIND CONTACT BY ID  -------------- //

    public Contact findContactById(Long id) {
        Optional<Contact> contact = contactRepo.findById(id);
        if(contact.isPresent()){
            return contact.get();
        } else {
            return null;
        }
    }

    //---------------CREATE CONTACT--------------------//

    public Contact saveContact(Contact contact){
        return contactRepo.save(contact);
    }

    //---------------UPDATE CONTACT--------------------//

    public Contact saveContact(Long id, Contact contact){
        Contact c = findContactById(id);
        c.setAddress(contact.getAddress());
        c.setCity(contact.getCity());
        c.setState(contact.getState());
        return contactRepo.save(c);
    }

    // -------------- DELETE CONTACT -------------- //

    public void deleteStudent(Long id) {
        contactRepo.deleteById(id);
    }
    
}
