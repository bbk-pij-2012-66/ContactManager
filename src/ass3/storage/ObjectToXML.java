package ass3.storage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import ass3.classes.ContactImpl;
import ass3.interfaces.Contact;

public class ObjectToXML 
{
	public static void main(String[] args) {

		String home = System.getProperty("user.home"); 
		//		File file = new File(home + "/tmp/" +"file.xml");
		File aFolder = new File(home + "/tmp");
		File aFile = new File(aFolder + "/contacts.txt");
		
		// test data
		//------------------------
		ArrayList<ContactImpl> contactsY = new ArrayList<ContactImpl>();
		
		ContactImpl aContact = new ContactImpl();
		aContact.setName("Baz Maj");
		aContact.setId(1);
		aContact.setNotes("junior java programmer");
		contactsY.add(aContact);
		
		ContactImpl bContact = new ContactImpl();
		bContact.setName("Matt Ross");
		bContact.setId(2);
		bContact.setNotes("junior c++ programmer");
		contactsY.add(bContact);
		
		ContactImpl cContact = new ContactImpl();
		cContact.setName("Pete Axe");
		cContact.setId(2);
		cContact.setNotes("java programmer");
		contactsY.add(cContact);
		
		ContactImpl dContact = new ContactImpl();
		dContact.setName("Pat Mas");
		dContact.setId(4);
		dContact.setNotes("senior java programmer");
		contactsY.add(dContact);
		//------------------------

		ContactList contactlist = new ContactList(contactsY);
		//contactlist.setContactList(contactsY);
		
		checkFolderExistsOtherwiseCreate(aFolder);
		//saveFileToFolder(contactsY, aFile);
		saveFileToFolder(contactlist, aFile);

	}

	public static void checkFolderExistsOtherwiseCreate(File aFolder)
	{
		// if folder doesn't  exist then create
		if(!aFolder.isDirectory())
		{
			aFolder.mkdir();
			System.out.println("folder created");
		} 
	}

	public static void saveFileToFolder(ContactList contacts, File file)
	{
		System.out.println("saving file...");
		try {
			
			// create JAXB context and instantiate marshaller
			JAXBContext jaxbContext = JAXBContext.newInstance(ContactList.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// Write to System.out
			jaxbMarshaller.marshal(contacts, System.out);

		    // Write to File
			jaxbMarshaller.marshal(contacts, file);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}


}