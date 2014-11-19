package controllers;

import services.ContactService;
import data.Contact;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.inject.Inject;

public class AddContactController {
    @Inject private ContactService contactService;

    @FXML private TextField firstName;
    @FXML private TextField lastName;

    @FXML protected void addContact() {
        Contact contact = new Contact(firstName.getText(), lastName.getText());
        contactService.addContact(contact);
    }
}
