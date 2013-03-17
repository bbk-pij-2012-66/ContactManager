package ass3.storage;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import ass3.classes.ContactImpl;

@XmlRootElement
public class ContactList
{

	private ArrayList<ContactImpl> contactsX;

	ContactList(){}
	
	ContactList(ArrayList<ContactImpl> contacts) {
		this.contactsX = contacts;
	}
	
	public void setContactList(ArrayList<ContactImpl> contacts) {
		this.contactsX = contacts;
	}

	public ArrayList<ContactImpl> getContactList() {
		return contactsX;
	}

}
