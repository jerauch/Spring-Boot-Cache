package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import com.example.demo.entity.Contact;

@Component
public class ContactRepository {

	@Cacheable("contacts")
    public Contact getById(long id) {
    	simulationDUneLenteur();
    	Contact contact = new Contact();
    	contact.setId(id);
    	contact.setNom("Contact " + id);
    	contact.setPrenom("Prénom " + id);
       	contact.setTelephone(Long.toString(id * 1111111111));
        return contact;
    }

    private void simulationDUneLenteur() {
        try {
            long time = 4000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
