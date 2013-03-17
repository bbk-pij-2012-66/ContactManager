package ass3.storage;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXML 
{
	public void pushToFile(ContactList contactsList) {

		String home = System.getProperty("user.home"); 

		File aFolder = new File(home + "/tmp");
		File aFile = new File(aFolder + "/contacts.txt");
		
		checkFolderExistsOtherwiseCreate(aFolder);
		saveFileToFolder(contactsList, aFile);

	}

	public static void checkFolderExistsOtherwiseCreate(File aFolder)
	{
		// if folder doesn't  exist then create
		if(!aFolder.isDirectory())
		{
			aFolder.mkdir();
			//System.out.println("folder created");
		} 
	}

	public static void saveFileToFolder(ContactList contacts, File file)
	{
		//System.out.println("saving file...");
		try {
			
			// create JAXB context and instantiate marshaller
			JAXBContext jaxbContext = JAXBContext.newInstance(ContactList.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// Write to System.out
			//jaxbMarshaller.marshal(contacts, System.out);

		    // Write to File
			jaxbMarshaller.marshal(contacts, file);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}


}