package ass3.storage;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import ass3.classes.ContactImpl;

public class ObjectToXML 
{
	public static void main(String[] args) {

		String home = System.getProperty("user.home"); 
		//		File file = new File(home + "/tmp/" +"file.xml");
		File aFolder = new File(home + "/tmp/");
		File aFile = new File(aFolder + "contacts.txt");
		
		// test data
		//------------------------
		ContactImpl aContact = new ContactImpl();
		aContact.setName("Baz Maj");
		aContact.setId(1);
		aContact.addNotes("junior java programmer");
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