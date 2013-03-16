package ass3.storage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

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
		List<Contact> contacts = new ArrayList<Contact>();
		
		ContactImpl aContact = new ContactImpl();
		aContact.setName("Baz Maj");
		aContact.setId(1);
		aContact.addNotes("junior java programmer");
		contacts.add(aContact);
		ContactImpl bContact = new ContactImpl();
		bContact.setName("Matt Ross");
		bContact.setId(2);
		bContact.addNotes("junior c++ programmer");
		contacts.add(bContact);
		ContactImpl cContact = new ContactImpl();
		cContact.setName("Pete Axe");
		cContact.setId(2);
		cContact.addNotes("java programmer");
		contacts.add(cContact);
		ContactImpl dContact = new ContactImpl();
		dContact.setName("Pat Mas");
		dContact.setId(4);
		dContact.addNotes("senior java programmer");
		contacts.add(dContact);
		//------------------------

		checkFolderExistsOtherwiseCreate(aFolder);
		saveFileToFolder(aContact, aFile);

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

	public static void saveFileToFolder(ContactImpl contacts, File file)
	{
		System.out.println("saving file...");
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(ContactImpl.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(contacts, file);
			jaxbMarshaller.marshal(contacts, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}


}