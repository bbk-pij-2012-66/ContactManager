package ass3.storage;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import ass3.classes.ContactImpl;

@XmlRootElement
public class ContactList
{

	private static ArrayList<ContactImpl> contactsX;

	public ContactList(){}
	
	ContactList(ArrayList<ContactImpl> contacts) {
		ContactList.contactsX = contacts;
	}
	
	public void setContactList(ArrayList<ContactImpl> contacts) {
		ContactList.contactsX = contacts;
	}

	public ArrayList<ContactImpl> getContactList() {
		return contactsX;
	}
	
	public static void addContact(ContactImpl contact)
	{
		contactsX.add(contact);
	}

}
