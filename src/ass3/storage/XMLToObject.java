package ass3.storage;


import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ass3.classes.ContactImpl;

public class XMLToObject 
{
	public static void main(String[] args) {

		String home = System.getProperty("user.home"); 
		File aFile = new File(home + "/tmp/contacts.txt");

		if (aFile.exists()) {

			try {
				// get variables from our xml file, created before
			    System.out.println();
			    System.out.println("Output from our XML File: ");
	
				JAXBContext jaxbContext = JAXBContext.newInstance(ContactList.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	
				ContactList pullContactList = (ContactList) jaxbUnmarshaller.unmarshal(aFile);
				ArrayList<ContactImpl> list = pullContactList.getContactList();
				
				for (ContactImpl contact : list) {
					System.out.println("[id=" + contact.getId() + ", name=" + contact.getName() + ", notes=" + contact.getNotes() + "]");	
				}
				
			} catch (JAXBException e) {
				e.printStackTrace();
			}

		}


	}



}